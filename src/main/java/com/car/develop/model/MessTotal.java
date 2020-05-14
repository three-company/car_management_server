package com.car.develop.model;

import lombok.Data;

/**
 * @author  zxs
 * @date  2020/5/14 9:48 上午
 */

/**
 * 每趟车计算
 */
@Data
public class MessTotal {
    private String id;

    /**
     * 信息表id
     */
    private String messageId;

    /**
     * 带现金
     */
    private String carryMoney;

    /**
     * 每吨运费(保留字段)
     */
    private String freight;

    /**
     * 交回
     */
    private String handIn;

    /**
     * 总收入
     */
    private String totalIncome;

    /**
     * 收支金额
     */
    private String money;

    /**
     * 总开销
     */
    private String totalPay;

    /**
     * 利润
     */
    private String totalReturn;
}