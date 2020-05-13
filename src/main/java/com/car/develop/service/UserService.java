package com.car.develop.service;

import java.util.List;
import com.car.develop.model.UserExample;
import com.car.develop.model.User;
    /**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
public interface UserService{


    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String id);

    int updateByExampleSelective(User record,UserExample example);

    int updateByExample(User record,UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
