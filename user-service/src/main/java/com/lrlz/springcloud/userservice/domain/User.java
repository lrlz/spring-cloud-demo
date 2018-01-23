package com.lrlz.springcloud.userservice.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class User implements Serializable {
    private Integer id;

    private String userName;

    private String account;

    private String password;

    private Date createTime;

    private Date updateTime;

    private Boolean deleteFlag;

    private String email;

}