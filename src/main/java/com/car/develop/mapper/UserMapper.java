package com.car.develop.mapper;

import com.car.develop.model.User;
import com.car.develop.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zxs
 * @date 2020/5/15 11:10 上午
 */
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}