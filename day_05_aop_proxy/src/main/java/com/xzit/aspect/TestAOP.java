package com.xzit.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/1
 */
public class TestAOP {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Waiter waiter=context.getBean(Waiter.class);
        /*waiter.showMenu();
        System.out.println("++++++++++++++++++++++++++++++++++");*/
        waiter.pay();
    }
}
