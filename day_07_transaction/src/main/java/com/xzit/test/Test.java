package com.xzit.test;

import com.xzit.service.AccService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/3
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        AccService service= (AccService) context.getBean("accServiceImpl");
        service.doPay(500);
    }
}
