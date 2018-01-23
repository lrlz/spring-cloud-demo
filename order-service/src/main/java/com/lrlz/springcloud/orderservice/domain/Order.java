package com.lrlz.springcloud.orderservice.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Order implements Serializable {
    private Integer id;

    private Date createTime;

    private Long postFee;

    private Long payment;

    private Integer status;

    private Date paymentTime;

    private Date updateTime;

    private Integer userId;

    private Boolean deleteFlag;

    private Integer paymentType;
}