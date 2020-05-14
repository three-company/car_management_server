package com.car.develop.service.impl;

import com.car.develop.mapper.*;
import com.car.develop.model.*;
import com.car.develop.util.ResultMessage;
import com.car.develop.util.UUIDUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import com.car.develop.service.MessageService;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageMapper messageMapper;

    @Resource
    private SiteMessMapper siteMessMapper;

    @Resource
    private MessTotalMapper messTotalMapper;

    @Resource
    private CarMapper carMapper;

    @Resource
    private DriverMapper driverMapper;

    @Override
    public long countByExample(MessageExample example) {
        return messageMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MessageExample example) {
        return messageMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Message record) {
        return messageMapper.insert(record);
    }

    @Override
    public int insertSelective(Message record) {
        return messageMapper.insertSelective(record);
    }

    @Override
    public List<Message> selectByExample(MessageExample example) {
        return messageMapper.selectByExample(example);
    }

    @Override
    public Message selectByPrimaryKey(String id) {
        return messageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Message record, MessageExample example) {
        return messageMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Message record, MessageExample example) {
        return messageMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Message record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Message record) {
        return messageMapper.updateByPrimaryKey(record);
    }

    /*
    * 添加出车信息
    * */
    @Override
    public ResultMessage<Message> insertone(Message message, SiteMess siteMess, MessTotal messTotal) {
        //添加站点信息
        String id = UUIDUtil.Uid;
        siteMess.setId(id);
        BigDecimal weightOne = new BigDecimal(siteMess.getWeightOne());
        BigDecimal weightTwo = new BigDecimal(siteMess.getWeightTwo());
        BigDecimal freightOne = new BigDecimal(siteMess.getFreightOne());
        BigDecimal freightTwo = new BigDecimal(siteMess.getFreightTwo());
        BigDecimal freightTotalOne = weightOne.multiply(freightOne);
        BigDecimal freightTotalTwo = weightTwo.multiply(freightTwo);
        siteMess.setFreightTotalOne(freightTotalOne.toString());
        siteMess.setFreightTotalTwo(freightTotalTwo.toString());
        int i = siteMessMapper.insert(siteMess);
        if (i < 0) {
            return new ResultMessage<>("11111", "添加失败", null);
        }
        //找车id
        CarExample carExample = new CarExample();
        carExample.createCriteria().andCarNumEqualTo(message.getCarId());
        List<Car> cars = carMapper.selectByExample(carExample);
        if (cars.isEmpty()){
            return new ResultMessage<>("11111","没找到该车的信息",null);
        }
        Car car = cars.get(0);

        //找司机id
        DriverExample driverExample = new DriverExample();
        driverExample.createCriteria().andNameEqualTo(message.getDriverId());
        List<Driver> drivers = driverMapper.selectByExample(driverExample);
        if (drivers.isEmpty()){
            return new ResultMessage<>("11111","没找到改司机的信息",null);
        }
        Driver driver = drivers.get(0);

        //插入出车信息
        String id2 = UUIDUtil.Uid;
        message.setId(id2);
        message.setCarId(car.getId());
        message.setDriverId(driver.getId());
        message.setSitemesId(id);
        int i1 = messageMapper.insert(message);
        if (i1 < 0){
            return new ResultMessage<>("11111","添加信息失败",null);
        }
        String id3 = UUIDUtil.Uid;
        messTotal.setId(id3);
        messTotal.setMessageId(id2);

        messTotalMapper.insert(messTotal);

        return new  ResultMessage("000","成功","1");
    }

}

