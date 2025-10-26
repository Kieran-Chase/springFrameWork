package com.xzit.user;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/25
 */
public class UserServiceImpl implements UserService{
    @Override
    public void save() {
        UserDao dao=(UserDao)BeanFactory.getBean("userDao");
        dao.save();
    }
}
