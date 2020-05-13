package com.car.develop.mapper;

import com.car.develop.model.Driver;
import com.car.develop.model.DriverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
public interface DriverMapper {
    long countByExample(DriverExample example);

    int deleteByExample(DriverExample example);

    int deleteByPrimaryKey(String id);

    int insert(Driver record);

    int insertSelective(Driver record);

    List<Driver> selectByExample(DriverExample example);

    Driver selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Driver record, @Param("example") DriverExample example);

    int updateByExample(@Param("record") Driver record, @Param("example") DriverExample example);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);
}