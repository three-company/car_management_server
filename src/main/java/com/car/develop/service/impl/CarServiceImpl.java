package com.car.develop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.car.develop.model.CarExample;
import com.car.develop.model.Car;
import com.car.develop.mapper.CarMapper;
import com.car.develop.service.CarService;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarMapper carMapper;

    @Override
    public long countByExample(CarExample example) {
        return carMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CarExample example) {
        return carMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return carMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Car record) {
        return carMapper.insert(record);
    }

    @Override
    public int insertSelective(Car record) {
        return carMapper.insertSelective(record);
    }

    @Override
    public List<Car> selectByExample(CarExample example) {
        return carMapper.selectByExample(example);
    }

    @Override
    public Car selectByPrimaryKey(String id) {
        return carMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Car record, CarExample example) {
        return carMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Car record, CarExample example) {
        return carMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Car record) {
        return carMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Car record) {
        return carMapper.updateByPrimaryKey(record);
    }

}

