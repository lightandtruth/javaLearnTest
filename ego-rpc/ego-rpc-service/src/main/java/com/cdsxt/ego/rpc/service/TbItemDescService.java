package com.cdsxt.ego.rpc.service;

import com.cdsxt.ego.rpc.pojo.TbItemDesc;
import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbItemDescExample;
public interface TbItemDescService{


    long countByExample(TbItemDescExample example);

    int deleteByExample(TbItemDescExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemDesc record);

    int insertSelective(TbItemDesc record);

    List<TbItemDesc> selectByExample(TbItemDescExample example);

    TbItemDesc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(TbItemDesc record,TbItemDescExample example);

    int updateByExample(TbItemDesc record,TbItemDescExample example);

    int updateByPrimaryKeySelective(TbItemDesc record);

    int updateByPrimaryKey(TbItemDesc record);

}
