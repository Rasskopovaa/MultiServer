package com.example.quotes.controller;
import com.example.quotes.model.Quote;
import com.example.quotes.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/quotes")
public class QuoteController {

    QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<Quote> findAll() {
        return quoteService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Quote findById(@PathVariable("id") Integer id) {
        return quoteService.findById(id);
    }
}