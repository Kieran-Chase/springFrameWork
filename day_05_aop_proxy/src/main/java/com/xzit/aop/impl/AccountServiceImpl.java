package com.xzit.aop.impl;

import com.xzit.aop.AccountService;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/30
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public void save() {
        System.out.println("银行保存财务业务");
    }

    @Override
    public void pay() {
        System.out.println("银行完成支付业务");
    }
}
