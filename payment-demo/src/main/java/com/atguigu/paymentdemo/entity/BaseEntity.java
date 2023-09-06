package com.atguigu.paymentdemo.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;

@Data
public class BaseEntity {

    // 定义主键策略：跟随数据库的主键自增
    @TableId(value = "id", type = IdType.AUTO)
    private String id; // 主键

    private Date createTime;// 创建时间

    private Date updateTime;// 更新时间
}
