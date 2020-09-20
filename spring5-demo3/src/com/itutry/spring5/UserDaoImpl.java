package com.itutry.spring5;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("save user");
    }

    @Override
    public User queryById(String id) {
        System.out.println("query user by id");
        return new User(id, "user");
    }
}
