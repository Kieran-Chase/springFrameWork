package com.xzit.aop;

import com.xzit.aop.impl.AccountServiceImpl;
import com.xzit.aop.impl.UserServiceImpl;
import com.xzit.aop.proxy.MyInvocationHandler;
import com.xzit.aop.proxy.ProxyUtil;

import java.lang.invoke.VarHandle;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/30
 */
public class Test {
    public static void main(String[] args) {
        /*UserService service= new UserServiceImpl();
        UserService proxy = (UserService) ProxyUtil.getProxy(service, new MyInvocationHandler(service));
        proxy.save();
        System.out.println("-----------------------------");
        proxy.delete();*/

        AccountService service= new AccountServiceImpl();
        AccountService proxy = (AccountService) ProxyUtil.getProxy(service, new MyInvocationHandler(service));
        proxy.save();
        System.out.println("-----------------------------");
        proxy.pay();
    }
}
