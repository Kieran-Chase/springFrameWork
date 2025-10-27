package com.xzit.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/27
 */
public class TestConstructor {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Student student=context.getBean(Student.class);
        System.out.println(student);
    }
}
