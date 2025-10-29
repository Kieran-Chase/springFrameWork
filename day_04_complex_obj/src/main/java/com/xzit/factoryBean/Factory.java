package com.xzit.factoryBean;

import org.springframework.context.annotation.Bean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/28
 */

public class Factory {
    public static Object getBean(String arg) {
        Bean bean = (Bean) XMLOperator.getBeanObj();
        //如果用户传递的参数中，是以&开头
        //就说明用户想要获取的对象是MyFactoryBean的对象
        if (arg.startsWith("&")) {
            String className = bean.getClazz();
            Object o = null;
            try {
                o = Class.forName(className).getConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return o;
        } else {
            String className = bean.getClazz();
            try {
                Class<?> clazz = Class.forName(className);
                Object o = clazz.getConstructor().newInstance();
                Method method = clazz.getDeclaredMethod("getObject");
                Object invoke = method.invoke(o, null);
                return invoke;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
