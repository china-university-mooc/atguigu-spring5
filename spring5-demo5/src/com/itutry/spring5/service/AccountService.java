package com.itutry.spring5.service;

import com.itutry.spring5.dao.AccountDao;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountDao accountDao;

    public AccountService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transferBalance(int from, int to, double account) {
        accountDao.reduceBalance(from, account);
        accountDao.addBalance(to, account);
    }
}
