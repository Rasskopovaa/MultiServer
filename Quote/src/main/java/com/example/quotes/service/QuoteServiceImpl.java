package com.example.quotes.service;


import com.example.quotes.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class QuoteServiceImpl implements QuoteService {
    private final String API= "https://www.breakingbadapi.com/api/quotes";
    private final String ID_API = "https://www.breakingbadapi.com/api/quotes/{id}";



   private final WebClient  webClient;

   @Autowired
    public QuoteServiceImpl(WebClient.Builder webClient) {
       this.webClient = webClient.build();
    }

    @Override
    public List<Quote> findAll() {
        return webClient
                .get()
                .uri(API)
                .retrieve()
                .bodyToFlux(Quote.class)
                .collectList()
                .block();
    }


    @Override
    public Quote findById(Integer id) {
            return webClient
                    .get()
                    .uri(ID_API, id)
                    .retrieve()
                    .bodyToMono(Quote.class)
                    .block();
        }

    }


