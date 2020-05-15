package com.car.develop.mapper;

import com.car.develop.model.Car;
import com.car.develop.model.CarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zxs
 * @date 2020/5/15 11:10 上午
 */
public interface CarMapper {
    long countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int deleteByPrimaryKey(String id);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}