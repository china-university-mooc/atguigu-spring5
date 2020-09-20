package com.itutry.spring5.dao;

import com.itutry.spring5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(User user) {
        String sql = "insert into user(name, status) values(?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getStatus());
    }

    @Override
    public void update(User user) {
        String sql = "update user set name=?, status=? where id=?";
        jdbcTemplate.update(sql, user.getName(), user.getStatus(), user.getId());
    }

    @Override
    public void deleteById(Integer id) {
        String sql = "delete from user where id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int count() {
        String sql = "select count(*) from user";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public User queryById(Integer id) {
        String sql = "select id, name, status from user where id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
    }

    @Override
    public List<User> queryAll() {
        String sql = "select id, name, status from user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void batchSave(List<User> users) {
        String sql = "insert into user(name, status) values(?,?)";
        List<Object[]> batchArgs = users.stream()
                .map(user -> new Object[]{user.getName(), user.getStatus()})
                .collect(Collectors.toList());

        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    @Override
    public void batchUpdate(List<User> users) {
        String sql = "update user set name=?, status=? where id=?";
        List<Object[]> batchArgs = users.stream()
                .map(user -> new Object[]{user.getName(), user.getStatus(), user.getId()})
                .collect(Collectors.toList());

        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    @Override
    public void batchDeleteById(List<Integer> ids) {
        String sql = "delete from user where id=?";
        List<Object[]> batchArgs = ids.stream()
                .map(id -> new Object[]{id})
                .collect(Collectors.toList());

        jdbcTemplate.batchUpdate(sql, batchArgs);
    }
}
