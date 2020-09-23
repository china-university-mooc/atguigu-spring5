package com.itutry.spring5.service;

import com.itutry.spring5.dao.AccountDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    private final AccountDao accountDao;

    public AccountService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Transactional
    public void transferBalance(int from, int to, double account) {
        accountDao.reduceBalance(from, account);
        int i = 10 / 0;
        accountDao.addBalance(to, account);
    }
}
