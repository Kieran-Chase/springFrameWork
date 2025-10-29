package com.xzit.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/28
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        // MyConnectionBean connection= (MyConnectionBean) context.getBean("connection");
        //MyConnectionBean connection= (MyConnectionBean) context.getBean("&connection");
        Connection connection= (Connection) context.getBean("connection");
        // Connection connection1= (Connection) context.getBean("connection");
        System.out.println(connection);
    }
}
