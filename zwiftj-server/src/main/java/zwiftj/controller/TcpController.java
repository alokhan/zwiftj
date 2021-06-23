package zwiftj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.MessageHeaders;
import zwiftj.api.model.TcpNodeMsgs;

import java.util.Arrays;

public class TcpController {

    private final static Logger logger = LoggerFactory.getLogger(TcpController.class);

    public byte[] handleMessage(byte[] message, MessageHeaders messageHeaders) {
        try {
            logger.info("Received TCP packet {}", new String(message));
            byte[] messageStripped = Arrays.copyOfRange(message, 1, message.length - 4);
            TcpNodeMsgs.TCPHello playerMessage = TcpNodeMsgs.TCPHello.parseFrom(messageStripped);
            logger.info("Received hello packet from player with id {}", playerMessage.getPlayerId());
            return TcpNodeMsgs.TCPServerInfo.newBuilder()
                    .setPlayerId(playerMessage.getPlayerId())
                    .setF3(0)
                    .addServers(TcpNodeMsgs.ServersType1.newBuilder().setF2(10).setF3(30).setF4(3)
                            .addDetails(TcpNodeMsgs.ServerDetails.newBuilder()
                                    .setIp("127.0.0.1").setPort(3022).setF1(1).setF2(6).build())
                            .addDetails(TcpNodeMsgs.ServerDetails.newBuilder()
                                    .setIp("127.0.0.1").setPort(3022).setF1(0).setF2(0).build())

                            .build())
                    .addOtherServers(TcpNodeMsgs.ServersType2.newBuilder()
                            .setPort(3022)
                            .addDetailsWrapper(TcpNodeMsgs.ServerConnectionDetailsWrapper.newBuilder()
                                    .setF1(1)
                                    .setF2(6)
                                    .addDetails(TcpNodeMsgs.ServerDetails.newBuilder()
                                            .setIp("127.0.0.1").setPort(3022).setF1(1).setF2(6).build())
                                    .build())
                            .addDetailsWrapper(TcpNodeMsgs.ServerConnectionDetailsWrapper.newBuilder()
                                    .setF1(0)
                                    .setF2(0)
                                    .addDetails(TcpNodeMsgs.ServerDetails.newBuilder()
                                            .setIp("127.0.0.1").setPort(3022).setF1(0).setF2(0).build())
                                    .build())
                            .build())
                    .build().toByteString().toByteArray();

        } catch (Exception e) {
            logger.error("Received unexpected message on TCP server {}", new String(message), e);
            return null;
        }
    }


}
