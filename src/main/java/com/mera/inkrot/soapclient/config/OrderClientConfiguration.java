package com.mera.inkrot.soapclient.config;

import com.mera.inkrot.soapclient.client.OrderClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class OrderClientConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.mera.inkrot.soapclient.wsdl.order");
        return marshaller;
    }

    @Bean
    public OrderClient orderClient(Jaxb2Marshaller marshaller) {
        OrderClient client = new OrderClient();
        client.setDefaultUri("http://localhost:8080/soap/order");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}