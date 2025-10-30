package com.xzit.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.time.LocalDate;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/30
 */
public class MyInterceptor implements MethodInterceptor {
    private Object obj;
    public MyInterceptor(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("进入系统");
        Object invoke = method.invoke(obj, objects);
        System.out.println(LocalDate.now());
        return invoke;
    }
}
