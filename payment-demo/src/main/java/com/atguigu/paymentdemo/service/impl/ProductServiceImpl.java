package com.atguigu.paymentdemo.service.impl;

import org.springframework.stereotype.Service;

import com.atguigu.paymentdemo.entity.Product;
import com.atguigu.paymentdemo.mapper.ProductMapper;
import com.atguigu.paymentdemo.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
