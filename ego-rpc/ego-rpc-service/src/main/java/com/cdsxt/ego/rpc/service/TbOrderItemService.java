package com.cdsxt.ego.rpc.service;

import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbOrderItem;
import com.cdsxt.ego.rpc.pojo.TbOrderItemExample;
public interface TbOrderItemService{


    long countByExample(TbOrderItemExample example);

    int deleteByExample(TbOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    TbOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(TbOrderItem record,TbOrderItemExample example);

    int updateByExample(TbOrderItem record,TbOrderItemExample example);

    int updateByPrimaryKeySelective(TbOrderItem record);

    int updateByPrimaryKey(TbOrderItem record);

}
