package com.atguigu.paymentdemo.service.impl;

import org.springframework.stereotype.Service;

import com.atguigu.paymentdemo.entity.RefundInfo;
import com.atguigu.paymentdemo.mapper.RefundInfoMapper;
import com.atguigu.paymentdemo.service.RefundInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements RefundInfoService {

}
