package com.itutry.spring5.demo2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class FooAdvice {

    @Before(value = "execution(* com.itutry.spring5.demo2.UserDao.add(..))")
    public void before() {
        System.out.println("foo before...");
    }
}
