package com.cdsxt.ego.rpc.service;

import java.util.List;

import com.cdsxt.ego.beans.EgoResult;
import com.cdsxt.ego.rpc.pojo.TbItemParamItemExample;
import com.cdsxt.ego.rpc.pojo.TbItemParamItem;
public interface TbItemParamItemService{


    long countByExample(TbItemParamItemExample example);

    int deleteByExample(TbItemParamItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItemParamItem record);

    int insertSelective(TbItemParamItem record);

    List<TbItemParamItem> selectByExample(TbItemParamItemExample example);

    TbItemParamItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbItemParamItem record,TbItemParamItemExample example);

    int updateByExample(TbItemParamItem record,TbItemParamItemExample example);

    int updateByPrimaryKeySelective(TbItemParamItem record);

    int updateByPrimaryKey(TbItemParamItem record);
}
