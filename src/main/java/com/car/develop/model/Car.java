package com.car.develop.model;

import java.util.Date;
import lombok.Data;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
/**
    * 大车信息
    */
@Data
public class Car {
    private String id;

    /**
    * 车牌号
    */
    private String carNum;

    /**
    * 检车开始时间
    */
    private Date checkStartTime;

    /**
    * 检车到期时间
    */
    private Date checkEndTime;

    /**
    * 保险开始时间
    */
    private Date insuranceStartTime;

    /**
    * 保险到期时间
    */
    private Date insuranceEndTime;
}