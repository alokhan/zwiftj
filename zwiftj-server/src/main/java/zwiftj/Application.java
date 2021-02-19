package zwiftj;

import de.dentrassi.crypto.pem.PemKeyStoreProvider;
import io.undertow.servlet.handlers.DefaultServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.security.Security;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Security.addProvider(new PemKeyStoreProvider());
        SpringApplication.run(Application.class, args);
    }


}