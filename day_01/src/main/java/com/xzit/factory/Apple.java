package com.xzit.factory;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/25
 */
public class Apple implements Fruit{

    @Override
    public void plant() {
        System.out.println("苹果种植");
    }

    @Override
    public void grow() {
        System.out.println("苹果生长");
    }

    @Override
    public void harvest() {
        System.out.println("苹果收获");
    }
}
