package com.itutry.spring5.demo3;

import com.itutry.spring5.test.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");

        Book book = applicationContext.getBean("myBean", Book.class);
        System.out.println(book);
    }
}
