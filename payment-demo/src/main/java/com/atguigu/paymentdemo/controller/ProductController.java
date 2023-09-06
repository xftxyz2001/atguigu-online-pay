package com.atguigu.paymentdemo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.paymentdemo.vo.R;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "商品管理")
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @ApiOperation("测试接口")
    @GetMapping("/test")
    public R test() {

        return R.ok().data("message", "hello").data("now", new Date());
    }

}
