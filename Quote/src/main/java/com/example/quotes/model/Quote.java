package com.example.quotes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class Quote implements Serializable {

    private String text;
    private String author;

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public Quote() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
