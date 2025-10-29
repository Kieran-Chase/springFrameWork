package com.xzit.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/28
 */
public class FactoryTest {
    public static void main(String[] args) {
       /* InstanceFactory factory=new InstanceFactory();
        Connection connection=factory.getConnection();*/
        //Connection connection1 = StaticFactory.getConnection();
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        //调用实例方法
        // Connection connection= (Connection) context.getBean("factoryConnection");
        //调用静态方法
        Connection connection= (Connection) context.getBean("staticConnection");
        System.out.println(connection);
    }
}
