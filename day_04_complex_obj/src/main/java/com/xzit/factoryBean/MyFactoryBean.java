package com.xzit.factoryBean;

import org.springframework.lang.Nullable;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/28
 */
public interface MyFactoryBean<T> {
    @Nullable
    T getObject() throws Exception;

    @Nullable
    Class<?> getObjectType();

    default boolean isSingleton() {
        return true;
    }
}
