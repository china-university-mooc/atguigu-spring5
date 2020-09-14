package com.itutry.spring5.test;

public class Order {

    private String name;
    private String address;

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getDesc() {
        return name + "::" + address;
    }
}
