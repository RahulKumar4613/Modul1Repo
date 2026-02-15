package com.codingshuttle.Module1Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appconfig {

    @Bean
    @Scope("request")
    PaymentService paymentService(){

        return new PaymentService();
    }
}
