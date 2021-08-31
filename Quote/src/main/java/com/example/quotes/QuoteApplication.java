package com.example.quotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class QuoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuoteApplication.class, args);
    }

    @Bean
    public WebClient.Builder webClientBuilder() {
        return  WebClient.builder();
    }

}
