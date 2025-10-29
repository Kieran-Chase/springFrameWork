package com.xzit.aop.staticProxy;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/29
 */
public class VBuss implements  Platform{
    private Factory  factory;
    private Factory factory1;
    @Override
    public void product() {
        add_friend();
        share();
        if(factory==null)
            factory=new Factory();
        factory.product();
        send_goods();

    }
    public void add_friend(){
        System.out.println("加好友");
    }
    public void share(){
        System.out.println("发朋友圈");
    }
    public void send_goods(){
        System.out.println("送货");
    }
}
