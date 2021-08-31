package com.example.quotes.service;

import com.example.quotes.model.Quote;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface QuoteService {

    public List<Quote> findAll();

    public Quote findById(Integer id);
}
