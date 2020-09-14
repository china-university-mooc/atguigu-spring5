package com.itutry.spring5.demo2;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void update() {
        userDao.update();
    }
}
