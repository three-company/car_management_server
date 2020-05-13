package com.car.develop.model;

import java.util.Date;
import lombok.Data;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
/**
    * 用户信息
    */
@Data
public class User {
    private String id;

    /**
    * 姓名
    */
    private String name;

    /**
    * 手机号
    */
    private String mobile;

    /**
    * 密码
    */
    private String password;

    /**
    * 注册时间
    */
    private Date registerTime;

    /**
    * 到期时间
    */
    private Date endTime;

    /**
    * 状态
    */
    private String status;
}