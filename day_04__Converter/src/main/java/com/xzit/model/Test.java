package com.xzit.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/29
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        /*Person bean=context.getBean(Person.class);
        System.out.println(bean);*/
        Student student=context.getBean(Student.class);
        System.out.println(student);
    }
}
