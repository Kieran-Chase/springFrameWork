package com.xzit.factory;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/25
 */
public class Test {
    public static void main(String[] args) {
        Fruit fruit=Factory.getFruit("orange");//new Apple();
        fruit.plant();
        fruit.grow();
        fruit.harvest();
    }
}
