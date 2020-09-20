package com.itutry.spring5;

import com.itutry.spring5.dao.UserDao;
import com.itutry.spring5.entity.User;
import com.itutry.spring5.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MyTest {

    private UserService userService;
    private UserDao userDao;

    @Before
    public void init() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        userService = applicationContext.getBean(UserService.class);
        userDao = applicationContext.getBean(UserDao.class);
    }

    @Test
    public void test1() {
        userService.createUser(new User("张三", "boy"));
    }

    @Test
    public void test2() {
        userService.updateUser(new User(1, "张三", "girl"));
    }

    @Test
    public void test3() {
        userService.deleteUserById(1);
    }

    @Test
    public void test4() {
        System.out.println(userService.getUserCount());
    }

    @Test
    public void test5() {
        System.out.println(userService.getUserById(2));
    }

    @Test
    public void test6() {
        System.out.println(userService.getAllUsers());
    }

    @Test
    public void test7() {
        userDao.batchSave(Arrays.asList(new User("李四", "a"), new User("王五", "b")));
    }

    @Test
    public void test8() {
        userDao.batchUpdate(Arrays.asList(new User(3, "李四", "c"), new User(4, "王五", "c")));
    }

    @Test
    public void test9() {
        userDao.batchDeleteById(Arrays.asList(3, 4, 5, 6));
    }
}
