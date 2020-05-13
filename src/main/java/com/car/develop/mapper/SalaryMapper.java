package com.car.develop.mapper;

import com.car.develop.model.Salary;
import com.car.develop.model.SalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
public interface SalaryMapper {
    long countByExample(SalaryExample example);

    int deleteByExample(SalaryExample example);

    int deleteByPrimaryKey(String id);

    int insert(Salary record);

    int insertSelective(Salary record);

    List<Salary> selectByExample(SalaryExample example);

    Salary selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Salary record, @Param("example") SalaryExample example);

    int updateByExample(@Param("record") Salary record, @Param("example") SalaryExample example);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);
}