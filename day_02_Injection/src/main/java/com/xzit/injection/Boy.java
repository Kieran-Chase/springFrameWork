package com.xzit.injection;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/26
 */
public class Boy {
    private String name;
    private Girl girl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }
    public void FindGF(){
        System.out.println(name+"找到了女朋友");
        System.out.println(girl);
    }
}
