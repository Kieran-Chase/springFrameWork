package com.xzit.user;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/25
 */
public class Test {
    public static void main(String[] args) {
        UserService service=new UserServiceImpl();
        service.save();
    }
}
