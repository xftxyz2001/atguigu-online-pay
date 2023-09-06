package com.atguigu.paymentdemo.service.impl;

import org.springframework.stereotype.Service;

import com.atguigu.paymentdemo.entity.OrderInfo;
import com.atguigu.paymentdemo.mapper.OrderInfoMapper;
import com.atguigu.paymentdemo.service.OrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
