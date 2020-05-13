package com.car.develop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.car.develop.mapper.MessageMapper;
import com.car.develop.model.MessageExample;
import com.car.develop.model.Message;
import com.car.develop.service.MessageService;
/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
@Service
public class MessageServiceImpl implements MessageService{

    @Resource
    private MessageMapper messageMapper;

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
    public int updateByExampleSelective(Message record,MessageExample example) {
        return messageMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Message record,MessageExample example) {
        return messageMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Message record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Message record) {
        return messageMapper.updateByPrimaryKey(record);
    }

}
