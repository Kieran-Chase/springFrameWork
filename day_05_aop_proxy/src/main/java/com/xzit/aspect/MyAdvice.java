package com.xzit.aspect;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/30
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *  通知(增强)
 */
@Aspect
public class MyAdvice {
    @Before(value="execution(public * com.xzit.aspect.*.showMenu(..))")
    public void doBefore(){
        System.out.println("欢迎光临本餐厅");
        System.out.println("很高兴为您服务");
        System.out.println("____________");
    }
}
