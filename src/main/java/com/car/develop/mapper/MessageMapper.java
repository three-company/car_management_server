package com.car.develop.mapper;

import com.car.develop.model.Message;
import com.car.develop.model.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zxs
 * @date 2020/5/15 11:10 上午
 */
public interface MessageMapper {
    long countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(String id);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}