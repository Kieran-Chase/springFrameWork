package com.xzit.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/27
 */
public class TestMulFile {
    public static void main(String[] args) {
        ApplicationContext context=new
                ClassPathXmlApplicationContext("applicationContext_main.xml");
        UserService service=context.getBean(UserService.class);
        service.saveUser();
    }
}
