package com.cdsxt.ego.rpc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cdsxt.ego.rpc.mapper.TbOrderShippingMapper;
import com.cdsxt.ego.rpc.pojo.TbOrderShipping;
import com.cdsxt.ego.rpc.pojo.TbOrderShippingExample;
import com.cdsxt.ego.rpc.service.TbOrderShippingService;
@Service
public class TbOrderShippingServiceImpl implements TbOrderShippingService{

    @Resource
    private TbOrderShippingMapper tbOrderShippingMapper;

    @Override
    public long countByExample(TbOrderShippingExample example) {
        return tbOrderShippingMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbOrderShippingExample example) {
        return tbOrderShippingMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String orderId) {
        return tbOrderShippingMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public int insert(TbOrderShipping record) {
        return tbOrderShippingMapper.insert(record);
    }

    @Override
    public int insertSelective(TbOrderShipping record) {
        return tbOrderShippingMapper.insertSelective(record);
    }

    @Override
    public List<TbOrderShipping> selectByExample(TbOrderShippingExample example) {
        return tbOrderShippingMapper.selectByExample(example);
    }

    @Override
    public TbOrderShipping selectByPrimaryKey(String orderId) {
        return tbOrderShippingMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByExampleSelective(TbOrderShipping record,TbOrderShippingExample example) {
        return tbOrderShippingMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbOrderShipping record,TbOrderShippingExample example) {
        return tbOrderShippingMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbOrderShipping record) {
        return tbOrderShippingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbOrderShipping record) {
        return tbOrderShippingMapper.updateByPrimaryKey(record);
    }

}
