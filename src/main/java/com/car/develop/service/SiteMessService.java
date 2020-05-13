package com.car.develop.service;

import java.util.List;
import com.car.develop.model.SiteMessExample;
import com.car.develop.model.SiteMess;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
public interface SiteMessService {


    long countByExample(SiteMessExample example);

    int deleteByExample(SiteMessExample example);

    int deleteByPrimaryKey(String id);

    int insert(SiteMess record);

    int insertSelective(SiteMess record);

    List<SiteMess> selectByExample(SiteMessExample example);

    SiteMess selectByPrimaryKey(String id);

    int updateByExampleSelective(SiteMess record, SiteMessExample example);

    int updateByExample(SiteMess record, SiteMessExample example);

    int updateByPrimaryKeySelective(SiteMess record);

    int updateByPrimaryKey(SiteMess record);

}


