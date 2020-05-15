package com.car.develop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.car.develop.model.SalaryExample;
import com.car.develop.mapper.SalaryMapper;
import com.car.develop.model.Salary;
import com.car.develop.service.SalaryService;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
@Service
public class SalaryServiceImpl implements SalaryService {

    @Resource
    private SalaryMapper salaryMapper;

    @Override
    public long countByExample(SalaryExample example) {
        return salaryMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SalaryExample example) {
        return salaryMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return salaryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Salary record) {
        return salaryMapper.insert(record);
    }

    @Override
    public int insertSelective(Salary record) {
        return salaryMapper.insertSelective(record);
    }

    @Override
    public List<Salary> selectByExample(SalaryExample example) {
        return salaryMapper.selectByExample(example);
    }

    @Override
    public Salary selectByPrimaryKey(String id) {
        return salaryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Salary record, SalaryExample example) {
        return salaryMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Salary record, SalaryExample example) {
        return salaryMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Salary record) {
        return salaryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Salary record) {
        return salaryMapper.updateByPrimaryKey(record);
    }

}

