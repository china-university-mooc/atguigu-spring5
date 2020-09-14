package com.itutry.spring5.demo4;

public class Order {

    private String name;

    public Order() {
        System.out.println("1. 无参构造");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2. set方法");
    }

    public void init() {
        System.out.println("3. 初始化方法");
    }

    public void destroy() {
        System.out.println("5. 销毁方法");
    }
}
