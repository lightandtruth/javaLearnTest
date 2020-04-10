package com.cdsxt.ego.rpc.service;

import com.cdsxt.ego.rpc.pojo.TbContent;
import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbContentExample;

public interface TbContentService{


    long countByExample(TbContentExample example);

    int deleteByExample(TbContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    List<TbContent> selectByExample(TbContentExample example);

    TbContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbContent record,TbContentExample example);

    int updateByExample(TbContent record,TbContentExample example);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKey(TbContent record);

}
