package com.itutry.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BarUserDao implements UserDao {
    @Override
    public void add() {
        System.out.println("bar dao add...");
    }
}
