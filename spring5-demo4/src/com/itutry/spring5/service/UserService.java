package com.itutry.spring5.service;

import com.itutry.spring5.dao.UserDao;
import com.itutry.spring5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void createUser(User user) {
        userDao.save(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }

    public int getUserCount() {
        return userDao.count();
    }

    public User getUserById(Integer id) {
        return userDao.queryById(id);
    }

    public List<User> getAllUsers() {
        return userDao.queryAll();
    }
}
