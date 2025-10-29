package com.xzit.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/28
 */
public class MyConnectionBean1 implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
