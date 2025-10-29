package com.xzit.aop.staticProxy;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/29
 */
public class Test {
    public static void main(String[] args) {
        Platform platform=new VBuss();//new Factory();
        platform.product();
    }
}
