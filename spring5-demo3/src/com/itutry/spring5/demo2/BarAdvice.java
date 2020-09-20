package com.itutry.spring5.demo2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class BarAdvice {

    @Before(value = "execution(* com.itutry.spring5.demo2.UserDao.add(..))")
    public void before() {
        System.out.println("bar before...");
    }
}
