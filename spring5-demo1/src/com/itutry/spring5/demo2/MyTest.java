package com.itutry.spring5.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = applicationContext.getBean("userService", UserService.class);

        userService.update();
    }
}
