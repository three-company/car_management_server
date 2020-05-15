package com.car.develop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.car.develop.model.MessTotalExample;
import com.car.develop.mapper.MessTotalMapper;
import com.car.develop.model.MessTotal;
import java.util.List;
import com.car.develop.service.MessTotalService;

/**
 * @author zxs
 * @date 2020/5/13 11:06 上午
 */
@Service
public class MessTotalServiceImpl implements MessTotalService {

    @Resource
    private MessTotalMapper messTotalMapper;

    @Override
    public long countByExample(MessTotalExample example) {
        return messTotalMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MessTotalExample example) {
        return messTotalMapper.deleteByExample(example);
    }

    @Override
    public int insert(MessTotal record) {
        return messTotalMapper.insert(record);
    }

    @Override
    public int insertSelective(MessTotal record) {
        return messTotalMapper.insertSelective(record);
    }

    @Override
    public List<MessTotal> selectByExample(MessTotalExample example) {
        return messTotalMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(MessTotal record, MessTotalExample example) {
        return messTotalMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MessTotal record, MessTotalExample example) {
        return messTotalMapper.updateByExample(record, example);
    }

}



