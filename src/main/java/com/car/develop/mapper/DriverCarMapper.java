package com.car.develop.mapper;

import com.car.develop.model.DriverCar;
import com.car.develop.model.DriverCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
public interface DriverCarMapper {
    long countByExample(DriverCarExample example);

    int deleteByExample(DriverCarExample example);

    int deleteByPrimaryKey(String id);

    int insert(DriverCar record);

    int insertSelective(DriverCar record);

    List<DriverCar> selectByExample(DriverCarExample example);

    DriverCar selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DriverCar record, @Param("example") DriverCarExample example);

    int updateByExample(@Param("record") DriverCar record, @Param("example") DriverCarExample example);

    int updateByPrimaryKeySelective(DriverCar record);

    int updateByPrimaryKey(DriverCar record);
}