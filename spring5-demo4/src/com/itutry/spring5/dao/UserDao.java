package com.itutry.spring5.dao;

import com.itutry.spring5.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    void update(User user);

    void deleteById(Integer id);

    int count();

    User queryById(Integer id);

    List<User> queryAll();

    void batchSave(List<User> users);

    void batchUpdate(List<User> users);

    void batchDeleteById(List<Integer> ids);
}
