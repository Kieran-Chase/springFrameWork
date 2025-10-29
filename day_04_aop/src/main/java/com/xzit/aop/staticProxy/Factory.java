package com.xzit.aop.staticProxy;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/29
 */
public class Factory implements Platform{
    @Override
    public void product() {
        System.out.println("工厂生产面膜产品");
    }
}
