package com.car.develop.service;

import java.util.List;
import com.car.develop.model.Driver;
import com.car.develop.model.DriverExample;
    /**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
public interface DriverService{


    long countByExample(DriverExample example);

    int deleteByExample(DriverExample example);

    int deleteByPrimaryKey(String id);

    int insert(Driver record);

    int insertSelective(Driver record);

    List<Driver> selectByExample(DriverExample example);

    Driver selectByPrimaryKey(String id);

    int updateByExampleSelective(Driver record,DriverExample example);

    int updateByExample(Driver record,DriverExample example);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);

}
