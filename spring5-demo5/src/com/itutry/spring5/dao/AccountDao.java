package com.itutry.spring5.dao;

public interface AccountDao {

    void addBalance(int id, double account);

    void reduceBalance(int id, double account);
}
