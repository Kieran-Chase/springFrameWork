package com.xzit.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/26
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        TeacherService service=context.getBean("teacherService1",TeacherService.class);
        System.out.println(service);
    }
}
