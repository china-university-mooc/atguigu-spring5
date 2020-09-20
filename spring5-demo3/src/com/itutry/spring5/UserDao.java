package com.itutry.spring5;

public interface UserDao {

    void save(User user);

    User queryById(String id);
}
