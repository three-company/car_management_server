package com.car.develop.service;

import com.car.develop.model.MessTotalExample;
import com.car.develop.model.MessTotal;
import java.util.List;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
public interface MessTotalService {


    long countByExample(MessTotalExample example);

    int deleteByExample(MessTotalExample example);

    int insert(MessTotal record);

    int insertSelective(MessTotal record);

    List<MessTotal> selectByExample(MessTotalExample example);

    int updateByExampleSelective(MessTotal record, MessTotalExample example);

    int updateByExample(MessTotal record, MessTotalExample example);

}



