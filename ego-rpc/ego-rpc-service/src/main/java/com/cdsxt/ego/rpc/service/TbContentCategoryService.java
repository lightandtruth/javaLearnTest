package com.cdsxt.ego.rpc.service;

import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbContentCategoryExample;
import com.cdsxt.ego.rpc.pojo.TbContentCategory;
public interface TbContentCategoryService{


    long countByExample(TbContentCategoryExample example);

    int deleteByExample(TbContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);

    List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    TbContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbContentCategory record,TbContentCategoryExample example);

    int updateByExample(TbContentCategory record,TbContentCategoryExample example);

    int updateByPrimaryKeySelective(TbContentCategory record);

    int updateByPrimaryKey(TbContentCategory record);

}
