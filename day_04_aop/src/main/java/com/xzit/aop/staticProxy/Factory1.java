package com.xzit.aop.staticProxy;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/29
 */
public class Factory1 implements Platform{
    @Override
    public void product() {
        System.out.println("生产口红产品");
    }
}
