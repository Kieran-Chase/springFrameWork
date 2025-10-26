package com.xzit.factory;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/25
 */
public class Factory {
    public static Fruit getFruit(String type){
        if(type.equals("apple")){
            Apple apple=new Apple();
            return apple;
        }else{
            Orange orange=new Orange();
            return orange;
        }
    }
}
