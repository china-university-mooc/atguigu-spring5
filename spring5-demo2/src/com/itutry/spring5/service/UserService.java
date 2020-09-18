package com.itutry.spring5.service;

import com.itutry.spring5.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component(value = "userService")
@Service
//@Controller
public class UserService {

    @Resource(name = "barUserDao")
    private UserDao userDao;

    public void add() {
        System.out.println("service add ...");
        userDao.add();
    }
}
