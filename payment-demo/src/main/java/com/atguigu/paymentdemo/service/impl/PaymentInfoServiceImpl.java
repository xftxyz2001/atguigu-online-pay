package com.atguigu.paymentdemo.service.impl;

import org.springframework.stereotype.Service;

import com.atguigu.paymentdemo.entity.PaymentInfo;
import com.atguigu.paymentdemo.mapper.PaymentInfoMapper;
import com.atguigu.paymentdemo.service.PaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}
