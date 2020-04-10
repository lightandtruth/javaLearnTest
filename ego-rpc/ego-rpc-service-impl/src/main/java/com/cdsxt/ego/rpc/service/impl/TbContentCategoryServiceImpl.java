package com.cdsxt.ego.rpc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cdsxt.ego.rpc.mapper.TbContentCategoryMapper;
import com.cdsxt.ego.rpc.pojo.TbContentCategoryExample;
import com.cdsxt.ego.rpc.pojo.TbContentCategory;
import com.cdsxt.ego.rpc.service.TbContentCategoryService;
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService{

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

    @Override
    public long countByExample(TbContentCategoryExample example) {
        return tbContentCategoryMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbContentCategoryExample example) {
        return tbContentCategoryMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbContentCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbContentCategory record) {
        return tbContentCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(TbContentCategory record) {
        return tbContentCategoryMapper.insertSelective(record);
    }

    @Override
    public List<TbContentCategory> selectByExample(TbContentCategoryExample example) {
        return tbContentCategoryMapper.selectByExample(example);
    }

    @Override
    public TbContentCategory selectByPrimaryKey(Long id) {
        return tbContentCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbContentCategory record,TbContentCategoryExample example) {
        return tbContentCategoryMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbContentCategory record,TbContentCategoryExample example) {
        return tbContentCategoryMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbContentCategory record) {
        return tbContentCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbContentCategory record) {
        return tbContentCategoryMapper.updateByPrimaryKey(record);
    }

}
