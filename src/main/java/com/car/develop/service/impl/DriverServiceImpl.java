package com.car.develop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.car.develop.mapper.DriverMapper;
import com.car.develop.model.Driver;
import com.car.develop.model.DriverExample;
import com.car.develop.service.DriverService;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
@Service
public class DriverServiceImpl implements DriverService {

    @Resource
    private DriverMapper driverMapper;

    @Override
    public long countByExample(DriverExample example) {
        return driverMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DriverExample example) {
        return driverMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return driverMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Driver record) {
        return driverMapper.insert(record);
    }

    @Override
    public int insertSelective(Driver record) {
        return driverMapper.insertSelective(record);
    }

    @Override
    public List<Driver> selectByExample(DriverExample example) {
        return driverMapper.selectByExample(example);
    }

    @Override
    public Driver selectByPrimaryKey(String id) {
        return driverMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Driver record, DriverExample example) {
        return driverMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Driver record, DriverExample example) {
        return driverMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Driver record) {
        return driverMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Driver record) {
        return driverMapper.updateByPrimaryKey(record);
    }

}

