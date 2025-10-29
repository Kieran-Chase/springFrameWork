package com.xzit.factoryBean;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/28
 */
public class TestMyFactory {
    public static void main(String[] args) {
        Object factoryBean = Factory.getBean("&factoryBean");
        factoryBean=Factory.getBean("factoryBean");
        System.out.println(factoryBean);
    }
}