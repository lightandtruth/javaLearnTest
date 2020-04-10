package com.cdsxt.ego.rpc.service;

import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbOrderShipping;
import com.cdsxt.ego.rpc.pojo.TbOrderShippingExample;
public interface TbOrderShippingService{


    long countByExample(TbOrderShippingExample example);

    int deleteByExample(TbOrderShippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(TbOrderShipping record);

    int insertSelective(TbOrderShipping record);

    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    TbOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(TbOrderShipping record,TbOrderShippingExample example);

    int updateByExample(TbOrderShipping record,TbOrderShippingExample example);

    int updateByPrimaryKeySelective(TbOrderShipping record);

    int updateByPrimaryKey(TbOrderShipping record);

}
