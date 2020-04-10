package com.cdsxt.ego.rpc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.cdsxt.ego.rpc.mapper.TbItemParamMapper;
import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbItemParamExample;
import com.cdsxt.ego.rpc.pojo.TbItemParam;
import com.cdsxt.ego.rpc.service.TbItemParamService;
@Service
public class TbItemParamServiceImpl implements TbItemParamService{

    @Resource
    private TbItemParamMapper tbItemParamMapper;

    @Override
    public long countByExample(TbItemParamExample example) {
        return tbItemParamMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbItemParamExample example) {
        return tbItemParamMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbItemParamMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbItemParam record) {
        return tbItemParamMapper.insert(record);
    }

    @Override
    public int insertSelective(TbItemParam record) {
        return tbItemParamMapper.insertSelective(record);
    }

    @Override
    public List<TbItemParam> selectByExample(TbItemParamExample example) {
        return tbItemParamMapper.selectByExample(example);
    }

    @Override
    public TbItemParam selectByPrimaryKey(Long id) {
        return tbItemParamMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbItemParam record,TbItemParamExample example) {
        return tbItemParamMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbItemParam record,TbItemParamExample example) {
        return tbItemParamMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbItemParam record) {
        return tbItemParamMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbItemParam record) {
        return tbItemParamMapper.updateByPrimaryKey(record);
    }

}
