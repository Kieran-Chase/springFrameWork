package com.xzit.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/26
 */
public class TestSimpleProperty {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Boy boy=(Boy)context.getBean("boy2");
        boy.FindGF();
    }
}
