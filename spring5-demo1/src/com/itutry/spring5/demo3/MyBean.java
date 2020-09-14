package com.itutry.spring5.demo3;

import com.itutry.spring5.test.Book;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Book> {

    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setName("九阳真经");
        book.setName("无名");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
