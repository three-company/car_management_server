package com.car.develop.service;

import java.util.List;
import com.car.develop.model.SalaryExample;
import com.car.develop.model.Salary;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
public interface SalaryService {


    long countByExample(SalaryExample example);

    int deleteByExample(SalaryExample example);

    int deleteByPrimaryKey(String id);

    int insert(Salary record);

    int insertSelective(Salary record);

    List<Salary> selectByExample(SalaryExample example);

    Salary selectByPrimaryKey(String id);

    int updateByExampleSelective(Salary record, SalaryExample example);

    int updateByExample(Salary record, SalaryExample example);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);

}

