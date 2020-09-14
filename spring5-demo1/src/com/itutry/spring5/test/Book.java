package com.itutry.spring5.test;

public class Book {

    private String name;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesc() {
        return name + "::" + author;
    }
}
