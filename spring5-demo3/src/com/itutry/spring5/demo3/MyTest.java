package com.itutry.spring5.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");

        UserDao userDao = applicationContext.getBean(UserDao.class);

        userDao.add();
    }
}
