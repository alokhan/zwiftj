package zwiftj.controller;

import org.springframework.messaging.MessageHeaders;

public class TcpController {

    public String handleMessage(byte[] message, MessageHeaders messageHeaders) {
        String string = new String(message);
        System.out.println(string);
        return string.toUpperCase();
    }
}
