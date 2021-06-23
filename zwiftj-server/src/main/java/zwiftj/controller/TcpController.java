package zwiftj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.MessageHeaders;

public class TcpController {

    private final static Logger LOGGER = LoggerFactory.getLogger(TcpController.class);

    public String handleMessage(byte[] message, MessageHeaders messageHeaders) {
        String string = new String(message);
        LOGGER.info("Received TCP message: {}", string);
        return string.toUpperCase();
    }
}
