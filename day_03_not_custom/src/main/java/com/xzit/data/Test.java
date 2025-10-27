package com.xzit.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Date;
/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/27
 */
public class Test {
    public static void main(String[] args) {
       /* HikariDataSource dataSource=new HikariDataSource();
        dataSource.setDriverClassName("");
        dataSource.setJdbcUrl("");
        dataSource.setUsername("");
        dataSource.setPassword("");*/
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        Date bean = ctx.getBean(Date.class);
        System.out.println(bean);
        /*HikariDataSource dataSource= (HikariDataSource) ctx.getBean("dataSource");
       // System.out.println(dataSource);
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(connection);*/
    }
}
