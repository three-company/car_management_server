package com.car.develop.model;

import lombok.Data;

/**
 * @author  zxs
 * @date  2020/5/15 11:10 上午
 */

/**
 * 行驶地点
 */
@Data
public class SiteMess {
    private String id;

    /**
     * 起始地点
     */
    private String startSiteOne;

    /**
     * 目的地
     */
    private String endSiteOne;

    /**
     * 物质名称
     */
    private String matterNameOne;

    /**
     * 重量
     */
    private String weightOne;

    /**
     * 运费总额
     */
    private String freightTotalOne;

    /**
     * 实收金额
     */
    private String receivedMoneyOne;

    /**
     * 欠款
     */
    private String debtMoneyOne;

    /**
     * 每吨运费
     */
    private String freightOne;

    private String startSiteTwo;

    private String endSiteTwo;

    private String matterNameTwo;

    private String weightTwo;

    private String freightTotalTwo;

    private String receivedMoneyTwo;

    private String debtMoneyTwo;

    private String freightTwo;

    private String delFlag;
}