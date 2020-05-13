package com.car.develop.model;

import java.util.Date;
import lombok.Data;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
/**
    * 司机信息
    */
@Data
public class Driver {
    private String id;

    /**
    * 司机姓名
    */
    private String name;

    /**
    * 司机手机号
    */
    private String mobile;

    /**
    * 司机年龄
    */
    private String age;

    /**
    * 身份证号
    */
    private String cardNum;

    /**
    * 性别
    */
    private String sex;

    /**
    * 驾龄
    */
    private String drivingYears;

    /**
    * 驾照类型
    */
    private String drivingLicenseType;

    /**
    * 入职时间
    */
    private Date entryTime;

    /**
    * 离职时间
    */
    private Date leaveTime;

    /**
    * 薪资
    */
    private String salary;

    /**
    * 用户id
    */
    private String userId;
}