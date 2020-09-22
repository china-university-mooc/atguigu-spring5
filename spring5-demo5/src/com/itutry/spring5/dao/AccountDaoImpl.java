package com.itutry.spring5.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao{

    private final JdbcTemplate jdbcTemplate;

    public AccountDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addBalance(int id, double account) {
        String sql = "update account set balance=balance+? where id = ?";
        jdbcTemplate.update(sql, account, id);
    }

    @Override
    public void reduceBalance(int id, double account) {
        String sql = "update account set balance=balance-? where id = ?";
        jdbcTemplate.update(sql, account, id);
    }
}
