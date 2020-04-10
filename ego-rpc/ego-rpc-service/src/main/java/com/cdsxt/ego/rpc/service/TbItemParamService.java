package com.cdsxt.ego.rpc.service;

import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbItemParamExample;
import com.cdsxt.ego.rpc.pojo.TbItemParam;
public interface TbItemParamService{


    long countByExample(TbItemParamExample example);

    int deleteByExample(TbItemParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItemParam record);

    int insertSelective(TbItemParam record);

    List<TbItemParam> selectByExample(TbItemParamExample example);

    TbItemParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbItemParam record,TbItemParamExample example);

    int updateByExample(TbItemParam record,TbItemParamExample example);

    int updateByPrimaryKeySelective(TbItemParam record);

    int updateByPrimaryKey(TbItemParam record);

}
