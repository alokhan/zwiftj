package zwiftj;

import de.dentrassi.crypto.pem.PemKeyStoreProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.ip.udp.UnicastReceivingChannelAdapter;
import org.springframework.integration.ip.udp.UnicastSendingMessageHandler;

import java.security.Security;

@SpringBootApplication
public class ZwiftServer {

    public static void main(String[] args) {
        Security.addProvider(new PemKeyStoreProvider());
        SpringApplication.run(ZwiftServer.class, args);
    }


}