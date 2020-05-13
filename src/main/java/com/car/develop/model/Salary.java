package com.car.develop.model;

import java.util.Date;
import lombok.Data;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
/**
    * 结算薪资
    */
@Data
public class Salary {
    private String id;

    /**
    * 用户id
    */
    private String userId;

    /**
    * 司机id
    */
    private String driverId;

    /**
    * 实际结算
    */
    private String actualPaySalary;

    /**
    * 结算日期
    */
    private Date payTime;

    /**
    * 预支
    */
    private String advance;

    /**
    * 预支日期
    */
    private Date advanceTime;
}