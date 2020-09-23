package com.itutry.spring5;

import org.springframework.context.support.GenericApplicationContext;

public class MyFunctional {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean("user", User.class, User::new);

        User user = (User) context.getBean("user");

        System.out.println(user);
    }
}
