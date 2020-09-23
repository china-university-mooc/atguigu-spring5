package com.itutry.spring5;


import com.itutry.spring5.config.AppConfig;
import com.itutry.spring5.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = AppConfig.class)
@SpringJUnitConfig(classes = AppConfig.class)
public class JUnit5Test {

    @Autowired
    private AccountService accountService;

    @Test
    public void test() {
        accountService.transferBalance(1, 2, 100);
    }
}
