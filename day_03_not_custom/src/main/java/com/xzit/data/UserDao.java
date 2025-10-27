package com.xzit.data;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/27
 */
public class UserDao implements IUserDao{
    public void save(){
        System.out.println("执行了保存方法");
    }
}
