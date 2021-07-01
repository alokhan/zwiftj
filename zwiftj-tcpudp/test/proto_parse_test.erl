%%%-------------------------------------------------------------------
%%% @author alo
%%% @copyright (C) 2021, <COMPANY>
%%% @doc
%%%
%%% @end
%%% Created : 01. Jul 2021 15:35
%%%-------------------------------------------------------------------
-module(proto_parse_test).
-include_lib("common_test/include/ct.hrl").

%% Test server callbacks
-export([suite/0, all/0]).
-export([parse_tcp_hello_test/1]).
%% API
-export([]).

suite() ->
  [{timetrap, {minutes, 1}}].

all() ->
  [parse_tcp_hello_test].

parse_tcp_hello_test(_Config) ->
  Message2 = <<0, 11, 0, 16, 1, 24, 0, 104, 0, 120, 87, 63, 221>>,
  Message3 = binary:part(Message2, 3, byte_size(Message2) - 5),
  ct:print("message ~p~n", [Message3]),

  ct:print("received binary <<~s>>~n", [[io_lib:format("~2.16.0B", [X]) || <<X:8>> <= Message3]]),
  HelloTCP = 'tcp-node-msgs_pb':decode_msg(Message3, 'TCPHello'),
  ct:print("Got message ~p~n", [HelloTCP]),
  ok.

