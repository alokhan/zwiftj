package zwiftj.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.ip.dsl.Tcp;
import org.springframework.integration.ip.tcp.serializer.TcpCodecs;
import org.springframework.integration.ip.udp.UnicastReceivingChannelAdapter;
import org.springframework.integration.ip.udp.UnicastSendingMessageHandler;
import org.springframework.web.servlet.config.annotation.*;
import zwiftj.controller.TcpController;
import zwiftj.interceptor.LogInterceptor;

import java.util.List;

@Configuration
@ComponentScan
public class ApplicationConfiguration implements WebMvcConfigurer {

    @Autowired
    private LogInterceptor logInterceptor;

    @Bean
    public TcpController tcpController(){
        return new TcpController();
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
    public UnicastSendingMessageHandler udpOut() {
        return new UnicastSendingMessageHandler("127.0.0.1", 3022);
    }

    @Bean(name = "udpReceivingAdapter")
    public UnicastReceivingChannelAdapter udpIn() {
        UnicastReceivingChannelAdapter adapter = new UnicastReceivingChannelAdapter(3022);
        adapter.setOutputChannelName("udpChannel");
        return adapter;
    }

    @Bean
    public IntegrationFlow server(TcpController serverSocketHandler) {
        return IntegrationFlows.from(Tcp.inboundGateway(
                Tcp.netServer(3023)
                        .deserializer(TcpCodecs.lf())
                        .serializer(TcpCodecs.lf())))
                .handle(serverSocketHandler::handleMessage)
                .get();
    }
}
