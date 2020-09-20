package com.itutry.spring5;

public class UserService {

    public void execute() {
        UserDao userDao = Factory.getUserDao();
        userDao.add();
    }
}
