package com.xzit.user;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/25
 */
public class UserDaoMybatisImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("使用MyBatis技术");
    }
}
