package com.xzit.aspect;

import org.springframework.stereotype.Component;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/1
 */
@Component
public class UserServiceImpl implements UserService{
    @Override
    public User login(String name, String password) {
        if(name.equals("scoot")&&password.equals("tiger")){
            return new User("scoot","tiger");
        }
        return null;
    }
}
