package com.example.patrick.androiddemo;

import java.io.Serializable;

/**
 * Created by patrick on 2/15/17.
 */

public class Book implements Serializable {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
