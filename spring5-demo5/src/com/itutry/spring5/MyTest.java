package com.itutry.spring5;

import com.itutry.spring5.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        AccountService accountService = applicationContext.getBean(AccountService.class);

        accountService.transferBalance(1, 2, 100);
    }
}
