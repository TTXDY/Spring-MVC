package com.aust.mvc.service;

import com.aust.mvc.mapper.UserInfoMapper;
import com.aust.mvc.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
// 接口
public class UserOrderServiceImpl implements com.aust.mvc.service.IUserOrderService {

    private UserOrderMapper orderMapper;
    private UserInfoMapper infoMapper;

    @Autowired
//    可以对成员变量、方法和构造函数进行标注，来完成自动装配的工作
    public void setOrderMapper(UserOrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Autowired
//    可以对成员变量、方法和构造函数进行标注，来完成自动装配的工作
    public void setInfoMapper(UserInfoMapper infoMapper) {
        this.infoMapper = infoMapper;
    }

    @Override
    //    重写父类方法

    @Transactional
    //    访问数据库事务管理
    public void placeOrder(String userno, String orderno, Double price) {

        orderMapper.insertOrder(userno,orderno,price);
        infoMapper.updatePoint(price.intValue(),userno);
    }
}