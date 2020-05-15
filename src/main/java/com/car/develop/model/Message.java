package com.car.develop.model;

import java.util.Date;
import lombok.Data;

/**
 * @author  zxs
 * @date  2020/5/15 11:10 上午
 */

/**
 * 出车信息
 */
@Data
public class Message {
    private String id;

    /**
     * 出车时间
     */
    private Date startTime;

    /**
     * 出车结束时间
     */
    private Date endTime;

    /**
     * 车id（车牌号）
     */
    private String carId;

    /**
     * 司机id（登记信息司机）
     */
    private String driverId;

    /**
     * 行驶地点id1
     */
    private String sitemesId;

    /**
     * 燃油费
     */
    private String fuelCharge;

    /**
     * 过路费
     */
    private String toll;

    /**
     * 罚款
     */
    private String fine;

    /**
     * 饭费
     */
    private String eatMoney;

    /**
     * 住宿费
     */
    private String hotelMoney;

    /**
     * 信息费
     */
    private String messageMoney;

    /**
     * 煤管费
     */
    private String coalMoney;

    /**
     * 装卸费
     */
    private String handMoney;

    /**
     * 修车费
     */
    private String repairCarMoney;

    /**
     * 其他开销
     */
    private String elseCost;

    /**
     * 拍照
     */
    private String image;

    /**
     * 备注各种详细信息
     */
    private String comment;

    private String delFlag;
}