package com.cdsxt.ego.rpc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.cdsxt.ego.rpc.pojo.TbOrderExample;
import com.cdsxt.ego.rpc.pojo.TbOrder;
import java.util.List;
import com.cdsxt.ego.rpc.mapper.TbOrderMapper;
import com.cdsxt.ego.rpc.service.TbOrderService;
@Service
public class TbOrderServiceImpl implements TbOrderService{

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Override
    public long countByExample(TbOrderExample example) {
        return tbOrderMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbOrderExample example) {
        return tbOrderMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String orderId) {
        return tbOrderMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public int insert(TbOrder record) {
        return tbOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(TbOrder record) {
        return tbOrderMapper.insertSelective(record);
    }

    @Override
    public List<TbOrder> selectByExample(TbOrderExample example) {
        return tbOrderMapper.selectByExample(example);
    }

    @Override
    public TbOrder selectByPrimaryKey(String orderId) {
        return tbOrderMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByExampleSelective(TbOrder record,TbOrderExample example) {
        return tbOrderMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbOrder record,TbOrderExample example) {
        return tbOrderMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbOrder record) {
        return tbOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbOrder record) {
        return tbOrderMapper.updateByPrimaryKey(record);
    }

}
