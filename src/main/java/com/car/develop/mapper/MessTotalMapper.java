package com.car.develop.mapper;

import com.car.develop.model.MessTotal;
import com.car.develop.model.MessTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
public interface MessTotalMapper {
    long countByExample(MessTotalExample example);

    int deleteByExample(MessTotalExample example);

    int insert(MessTotal record);

    int insertSelective(MessTotal record);

    List<MessTotal> selectByExample(MessTotalExample example);

    int updateByExampleSelective(@Param("record") MessTotal record, @Param("example") MessTotalExample example);

    int updateByExample(@Param("record") MessTotal record, @Param("example") MessTotalExample example);
}