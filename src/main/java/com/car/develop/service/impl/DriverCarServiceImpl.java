package com.car.develop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.car.develop.model.DriverCarExample;
import com.car.develop.model.DriverCar;
import com.car.develop.mapper.DriverCarMapper;
import com.car.develop.service.DriverCarService;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
@Service
public class DriverCarServiceImpl implements DriverCarService {

    @Resource
    private DriverCarMapper driverCarMapper;

    @Override
    public long countByExample(DriverCarExample example) {
        return driverCarMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DriverCarExample example) {
        return driverCarMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return driverCarMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DriverCar record) {
        return driverCarMapper.insert(record);
    }

    @Override
    public int insertSelective(DriverCar record) {
        return driverCarMapper.insertSelective(record);
    }

    @Override
    public List<DriverCar> selectByExample(DriverCarExample example) {
        return driverCarMapper.selectByExample(example);
    }

    @Override
    public DriverCar selectByPrimaryKey(String id) {
        return driverCarMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(DriverCar record, DriverCarExample example) {
        return driverCarMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(DriverCar record, DriverCarExample example) {
        return driverCarMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(DriverCar record) {
        return driverCarMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DriverCar record) {
        return driverCarMapper.updateByPrimaryKey(record);
    }

}

