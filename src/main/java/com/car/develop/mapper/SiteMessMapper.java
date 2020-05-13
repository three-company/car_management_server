package com.car.develop.mapper;

import com.car.develop.model.SiteMess;
import com.car.develop.model.SiteMessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zxs
 * @date 2020/5/13 3:15 下午
 */
public interface SiteMessMapper {
    long countByExample(SiteMessExample example);

    int deleteByExample(SiteMessExample example);

    int deleteByPrimaryKey(String id);

    int insert(SiteMess record);

    int insertSelective(SiteMess record);

    List<SiteMess> selectByExample(SiteMessExample example);

    SiteMess selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SiteMess record, @Param("example") SiteMessExample example);

    int updateByExample(@Param("record") SiteMess record, @Param("example") SiteMessExample example);

    int updateByPrimaryKeySelective(SiteMess record);

    int updateByPrimaryKey(SiteMess record);
}