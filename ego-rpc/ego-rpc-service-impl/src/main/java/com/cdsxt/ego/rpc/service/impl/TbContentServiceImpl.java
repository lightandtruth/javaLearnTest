package com.cdsxt.ego.rpc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.cdsxt.ego.rpc.pojo.TbContent;
import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbContentExample;
import com.cdsxt.ego.rpc.mapper.TbContentMapper;
import com.cdsxt.ego.rpc.service.TbContentService;
@Service
public class TbContentServiceImpl implements TbContentService{

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public long countByExample(TbContentExample example) {
        return tbContentMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbContentExample example) {
        return tbContentMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbContentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbContent record) {
        return tbContentMapper.insert(record);
    }

    @Override
    public int insertSelective(TbContent record) {
        return tbContentMapper.insertSelective(record);
    }

    @Override
    public List<TbContent> selectByExample(TbContentExample example) {
        return tbContentMapper.selectByExample(example);
    }

    @Override
    public TbContent selectByPrimaryKey(Long id) {
        return tbContentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbContent record,TbContentExample example) {
        return tbContentMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbContent record,TbContentExample example) {
        return tbContentMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbContent record) {
        return tbContentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbContent record) {
        return tbContentMapper.updateByPrimaryKey(record);
    }

}
