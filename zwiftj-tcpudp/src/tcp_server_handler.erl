%%%-------------------------------------------------------------------
%%% @author alo
%%% @copyright (C) 2021, <COMPANY>
%%% @doc
%%%
%%% @end
%%% Created : 01. Jul 2021 13:59
%%%-------------------------------------------------------------------
-module(tcp_server_handler).

-include("includes/tcp-node-msgs_pb.hrl").
-behaviour(gen_server).
-export([start_link/1]).
-export([init/1, handle_call/3, handle_cast/2, handle_info/2,
  terminate/2, code_change/3]).
-record(state, {lsock, socket, addr}).
-define(Timeout, 120 * 1000).

start_link(LSock) ->
  io:format("tcp handler start link~n"),
  gen_server:start_link(?MODULE, [LSock], []).

init([LSock]) ->
  io:format("tcp handler init ~n"),
  inet:setopts(LSock, [{active, once}, {packet, 2}]),
  gen_server:cast(self(), tcp_accept),
  {ok, #state{lsock = LSock}}.

handle_call(Msg, _From, State) ->
  io:format("tcp handler call ~p~n", [Msg]),
  {reply, {ok, Msg}, State}.

handle_cast(tcp_accept, #state{lsock = LSock} = State) ->
  {ok, CSock} = gen_tcp:accept(LSock),
  io:format("tcp handler info accept client ~p~n", [CSock]),
  {ok, {IP, _Port}} = inet:peername(CSock),
  start_server_listener(self()),
  {noreply, State#state{socket = CSock, addr = IP}, ?Timeout};

handle_cast(stop, State) ->
  {stop, normal, State}.

handle_info({tcp, Socket, Data}, State) ->
  inet:setopts(Socket, [{active, once}]),
  io:format("tcp handler info ~p got message ~p~n", [self(), Data]),
  try
    DataStripped = binary:part(Data, 1, byte_size(Data) - 5),
    HelloTCP = 'tcp-node-msgs_pb':decode_msg(DataStripped, 'TCPHello'),
    io:format("Got hello from player ~p~n", [HelloTCP#'TCPHello'.player_id]),

    ServerDetail1 = #'ServerDetails'{ip = "127.0.0.1", port = 3022, f1 = 0, f2 = 0},
    ServerDetail2 = #'ServerDetails'{ip = "127.0.0.1", port = 3022, f1 = 1, f2 = 6},

    ServerType = #'ServersType1'{f2 = 10, f3 = 30, f4 = 3, details = [ServerDetail2, ServerDetail1]},
    Wrapper2 = #'ServerConnectionDetailsWrapper'{f1 = 1, f2 = 6, details = [ServerDetail2]},
    Wrapper1 = #'ServerConnectionDetailsWrapper'{f1 = 0, f2 = 0, details = [ServerDetail1]},

    OtherServer = #'ServersType2'{port = 3022, details_wrapper = [Wrapper1, Wrapper2]},

    TcpServerInfo = 'tcp-node-msgs_pb':encode_msg(#'TCPServerInfo'{f3 = 0,
      player_id = 1,
      servers = [ServerType],
      other_servers = [OtherServer]}),

    io:format("Sending udp server info ~p~n", [TcpServerInfo]),

    ok = gen_tcp:send(Socket, <<TcpServerInfo/binary>>),
    {noreply, State, ?Timeout}
  catch
    _ -> {noreply, State, ?Timeout}
  end;

handle_info({tcp_closed, _Socket}, #state{addr = Addr} = State) ->
  io:format("tcp handler info ~p client ~p disconnected~n", [self(), Addr]),
  {stop, normal, State};

handle_info(timeout, State) ->
  io:format("tcp handler info ~p client connection timeout~n", [self()]),
  {stop, normal, State};

handle_info(_Info, State) ->
  io:format("tcp handler info ingore ~p~n", [_Info]),
  {noreply, State}.

terminate(_Reason, #state{socket = Socket}) ->
  io:format("tcp handler terminate ~p~n", [_Reason]),
  (catch gen_tcp:close(Socket)),
  ok.

code_change(_OldVsn, State, _Extra) ->
  {ok, State}.

start_server_listener(Pid) ->
  gen_server:cast(tcp_server_listener, {tcp_accept, Pid}).