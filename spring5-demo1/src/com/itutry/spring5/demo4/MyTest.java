package com.itutry.spring5.demo4;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Order order = context.getBean("order", Order.class);
        System.out.println("4. 使用bean: " + order);

        context.close();
    }
}
