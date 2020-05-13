package com.car.develop.model;

import lombok.Data;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
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
    private String startSite;

    /**
    * 目的地
    */
    private String endSite;

    /**
    * 物质名称
    */
    private String matterName;

    /**
    * 重量
    */
    private String weight;

    /**
    * 运费总额
    */
    private String freightTotal;

    /**
    * 实收金额
    */
    private String receivedMoney;

    /**
    * 欠款
    */
    private String debtMoney;
}