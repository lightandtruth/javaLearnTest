package com.cdsxt.ego.rpc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.cdsxt.ego.rpc.pojo.TbItemDesc;
import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbItemDescExample;
import com.cdsxt.ego.rpc.mapper.TbItemDescMapper;
import com.cdsxt.ego.rpc.service.TbItemDescService;
@Service
public class TbItemDescServiceImpl implements TbItemDescService{

    @Resource
    private TbItemDescMapper tbItemDescMapper;

    @Override
    public long countByExample(TbItemDescExample example) {
        return tbItemDescMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbItemDescExample example) {
        return tbItemDescMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long itemId) {
        return tbItemDescMapper.deleteByPrimaryKey(itemId);
    }

    @Override
    public int insert(TbItemDesc record) {
        return tbItemDescMapper.insert(record);
    }

    @Override
    public int insertSelective(TbItemDesc record) {
        return tbItemDescMapper.insertSelective(record);
    }

    @Override
    public List<TbItemDesc> selectByExample(TbItemDescExample example) {
        return tbItemDescMapper.selectByExample(example);
    }

    @Override
    public TbItemDesc selectByPrimaryKey(Long itemId) {
        return tbItemDescMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public int updateByExampleSelective(TbItemDesc record,TbItemDescExample example) {
        return tbItemDescMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbItemDesc record,TbItemDescExample example) {
        return tbItemDescMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbItemDesc record) {
        return tbItemDescMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbItemDesc record) {
        return tbItemDescMapper.updateByPrimaryKey(record);
    }

}
