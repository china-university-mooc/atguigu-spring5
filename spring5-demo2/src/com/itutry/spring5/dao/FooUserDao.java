package com.itutry.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository
public class FooUserDao implements UserDao {
    @Override
    public void add() {
        System.out.println("foo dao add...");
    }
}
