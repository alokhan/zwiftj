package zwiftj.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.ip.dsl.Tcp;
import org.springframework.integration.ip.dsl.Udp;
import org.springframework.integration.ip.tcp.serializer.TcpCodecs;
import org.springframework.integration.ip.udp.UnicastReceivingChannelAdapter;
import org.springframework.integration.ip.udp.UnicastSendingMessageHandler;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.servlet.config.annotation.*;
import zwiftj.controller.ApiController;
import zwiftj.controller.TcpController;
import zwiftj.controller.UdpController;
import zwiftj.interceptor.LogInterceptor;

import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan
public class ApplicationConfiguration implements WebMvcConfigurer {

    public static final Logger logger = LoggerFactory.getLogger(ApplicationConfiguration.class);

    @Autowired
    private LogInterceptor logInterceptor;

    @Bean
    public TcpController tcpController(){
        return new TcpController();
    }

    @Bean
    public UdpController udpController(){
        return new UdpController();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor).addPathPatterns("/*");
        ;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        // Do nothing instead of configurer.enable();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }


    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new ProtobufHttpMessageConverter());
    }

    @Bean
    public IntegrationFlow udpServer(UdpController udpController) {
        return IntegrationFlows.from(Udp.inboundAdapter(3022))
                .handle(udpController::handleMessage)
                .channel("udpChannel").get();
    }

    @ServiceActivator(inputChannel = "udpChannel")
    public void udpMessageHandle(@Payload byte[] payload, @Headers Map<String, Object> headers) {
        String message = new String(payload);
        logger.info("Received UDP packet:" + message);
    }

    @Bean
    public IntegrationFlow tcpServer(TcpController serverSocketHandler) {
        return IntegrationFlows.from(Tcp.inboundGateway(
                Tcp.netServer(3023)
                        .deserializer(TcpCodecs.raw())
                        .serializer(TcpCodecs.raw())))
                .handle(serverSocketHandler::handleMessage)
                .get();
    }
}
