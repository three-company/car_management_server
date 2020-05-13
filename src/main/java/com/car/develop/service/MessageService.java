package com.car.develop.service;

import java.util.List;
import com.car.develop.model.MessageExample;
import com.car.develop.model.Message;
    /**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
public interface MessageService{


    long countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(String id);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(String id);

    int updateByExampleSelective(Message record,MessageExample example);

    int updateByExample(Message record,MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

}
