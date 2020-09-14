package com.itutry.spring5.demo6;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class MyTest {

    @Test
    public void test1() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");

        DataSource dataSource = context.getBean("dataSource", DataSource.class);

        Connection connection = dataSource.getConnection();

        System.out.println(connection);
    }
}
