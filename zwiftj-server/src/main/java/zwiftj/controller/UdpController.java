package zwiftj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.Map;

public class UdpController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UdpController.class);

    public byte[] handleMessage(@Payload byte[] payload, @Headers Map<String, Object> headers) {
        String messageContent = new String(payload);
        LOGGER.info("Received UDP message: {}", messageContent);
        return payload;
    }
}
