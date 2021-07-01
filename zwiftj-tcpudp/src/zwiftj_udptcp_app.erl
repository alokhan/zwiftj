%%%-------------------------------------------------------------------
%% @doc zwiftj-udptcp public API
%% @end
%%%-------------------------------------------------------------------

-module(zwiftj_udptcp_app).

-behaviour(application).

-export([start/2, stop/1]).
-define(PORT,  3023).

start(_Type, _Args) ->
    io:format("tcp app start~n"),
    case tcp_server_sup:start_link(?PORT) of
        {ok, Pid} ->
            {ok, Pid};
        Other ->
            {error, Other}
    end.

stop(_S) ->
    ok.

%% internal functions
