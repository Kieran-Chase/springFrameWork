package com.xzit.factory;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/25
 */
public class Orange implements Fruit{
    @Override
    public void plant() {
        System.out.println("橙子种植");
    }

    @Override
    public void grow() {
        System.out.println("橙子生长");
    }

    @Override
    public void harvest() {
        System.out.println("橙子收获");
    }
}
