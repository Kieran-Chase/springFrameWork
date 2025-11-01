package com.xzit.aspect;

import com.xzit.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/1
 */
public class TestLogin {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserService service= (UserService) context.getBean("userServiceImpl");
        service.login("scoot","tiger");
    }
}
