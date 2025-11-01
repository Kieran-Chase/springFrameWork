package com.xzit.aspect;

import org.springframework.stereotype.Component;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/30
 */
@Component
public class Waiter {
    public void showMenu(){
        System.out.println("请点菜");
    }
    public void pay(){
        System.out.println("请付款");
    }

}
