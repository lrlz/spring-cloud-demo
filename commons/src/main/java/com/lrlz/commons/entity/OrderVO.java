package com.lrlz.commons.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/14
 */
@Data
public class OrderVO implements Serializable {
    private Integer id;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
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
