package com.xzit.service;

import com.xzit.entity.Acc;
import com.xzit.entity.Records;
import com.xzit.mapper.AccMapper;
import com.xzit.mapper.RecordsMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/3
 */
@Service
public class AccServiceImpl implements AccService {
    @Resource
    private AccMapper accMapper;
    @Resource
    private RecordsMapper recordsMapper;

    @Transactional
    @Override
    public void doPay(int money) {
        //存一条交易记录
        Records records=new Records();
        records.setAccno("123456").setCategory("支出").setMoney(money);
        recordsMapper.insert(records);
        System.out.println("执行交易记录处理");

        int i=10/0;//算术异常（运行时异常）

        //修改用户原账户下的余额
        Acc acc=new Acc();
        acc.setAccno("123456");
        acc.setMoney(money);
        accMapper.update(acc);
        System.out.println("执行用户余额修改处理");
    }
}
