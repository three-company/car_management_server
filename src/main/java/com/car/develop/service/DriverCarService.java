package com.car.develop.service;

import java.util.List;
import com.car.develop.model.DriverCarExample;
import com.car.develop.model.DriverCar;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
public interface DriverCarService {


    long countByExample(DriverCarExample example);

    int deleteByExample(DriverCarExample example);

    int deleteByPrimaryKey(String id);

    int insert(DriverCar record);

    int insertSelective(DriverCar record);

    List<DriverCar> selectByExample(DriverCarExample example);

    DriverCar selectByPrimaryKey(String id);

    int updateByExampleSelective(DriverCar record, DriverCarExample example);

    int updateByExample(DriverCar record, DriverCarExample example);

    int updateByPrimaryKeySelective(DriverCar record);

    int updateByPrimaryKey(DriverCar record);

}

