package com.itutry.spring5;


import com.itutry.spring5.config.AppConfig;
import com.itutry.spring5.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class JUnit4Test {

    @Autowired
    private AccountService accountService;

    @Test
    public void test() {
        accountService.transferBalance(1, 2, 100);
    }
}
