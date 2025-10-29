package com.xzit.factoryBean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/28
 */
public class MyConnectionBean implements FactoryBean<Connection> {


    @Override
    public Connection getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /**
     *通过FactoryBean提供创建的对象，是否是单例模式
     * @return
     */
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
