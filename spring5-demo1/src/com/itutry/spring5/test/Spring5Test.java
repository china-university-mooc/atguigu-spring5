package com.itutry.spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Spring5Test {

    @Test
    public void testAdd() {
        // 1. 加载Spring配置文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/bean1.xml");

        // 2. 获取配置创建的对象
        System.out.println("get Bean...");
        User user = context.getBean("user", User.class);

        // 3. 使用对象
        System.out.println(user);
        user.add();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);

        System.out.println(book.getDesc());

        System.out.println(context.getBean("book", Book.class));
        System.out.println(context.getBean("book", Book.class));
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Order order = context.getBean("order", Order.class);

        System.out.println(order.getDesc());
    }
}
