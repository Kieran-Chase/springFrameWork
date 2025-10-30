package com.xzit.aop.impl;

import com.xzit.aop.UserService;

import java.time.LocalDate;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/30
 */
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("增加用户管理");
    }

    @Override
    public void delete() {
        System.out.println("删除用户管理");
    }
}
