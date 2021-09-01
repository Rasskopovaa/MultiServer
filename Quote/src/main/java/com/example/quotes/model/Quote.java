package com.example.quotes.model;

import java.io.Serializable;

public class Quote implements Serializable  {


    private Integer quote_id;

    private String quote;

    private String author;

    private String series;

    public Quote(Integer quote_id, String quote, String author, String series) {
        this.quote_id = quote_id;
        this.quote = quote;
        this.author = author;
        this.series = series;
    }

    public Quote() {
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Integer getQuote_id() {
        return quote_id;
    }

    public void setQuote_id(Integer quote_id) {
        this.quote_id = quote_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
