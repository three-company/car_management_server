package com.car.develop.service;

import java.util.List;
import com.car.develop.model.CarExample;
import com.car.develop.model.Car;
    /**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
public interface CarService{


    long countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int deleteByPrimaryKey(String id);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(String id);

    int updateByExampleSelective(Car record,CarExample example);

    int updateByExample(Car record,CarExample example);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

}
