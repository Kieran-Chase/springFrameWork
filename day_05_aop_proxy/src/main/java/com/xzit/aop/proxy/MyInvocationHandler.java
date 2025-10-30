package com.xzit.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDate;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/30
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object obj;
    public MyInvocationHandler(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("pay".equals(method.getName())){
            System.out.println("开始监控系统...");
            long t1=System.currentTimeMillis();//当前时间
            try {
                Thread.sleep((int)(Math.random()*2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Object o = method.invoke(obj, args);
            long t2=System.currentTimeMillis();//当前时间
            System.out.println("结束监控系统...");
            System.out.println("一共耗费了"+(t2-t1)+"毫秒");
            //加日志处理
            System.out.println(LocalDate.now()+"访问系统");
            return o;
        }else{
            return method.invoke(obj, args);
        }
    }
}
