package com.car.develop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.car.develop.mapper.SiteMessMapper;
import java.util.List;
import com.car.develop.model.SiteMessExample;
import com.car.develop.model.SiteMess;
import com.car.develop.service.SiteMessService;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
@Service
public class SiteMessServiceImpl implements SiteMessService {

    @Resource
    private SiteMessMapper siteMessMapper;

    @Override
    public long countByExample(SiteMessExample example) {
        return siteMessMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SiteMessExample example) {
        return siteMessMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return siteMessMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SiteMess record) {
        return siteMessMapper.insert(record);
    }

    @Override
    public int insertSelective(SiteMess record) {
        return siteMessMapper.insertSelective(record);
    }

    @Override
    public List<SiteMess> selectByExample(SiteMessExample example) {
        return siteMessMapper.selectByExample(example);
    }

    @Override
    public SiteMess selectByPrimaryKey(String id) {
        return siteMessMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SiteMess record, SiteMessExample example) {
        return siteMessMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SiteMess record, SiteMessExample example) {
        return siteMessMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SiteMess record) {
        return siteMessMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SiteMess record) {
        return siteMessMapper.updateByPrimaryKey(record);
    }

}



