package com.car.develop.model;

import lombok.Data;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
/**
    * 司机与大车
    */
@Data
public class DriverCar {
    private String id;

    /**
    * 大车id
    */
    private String carId;

    /**
    * 主驾
    */
    private String driverIdOne;

    /**
    * 副驾
    */
    private String driverIdTwo;
}