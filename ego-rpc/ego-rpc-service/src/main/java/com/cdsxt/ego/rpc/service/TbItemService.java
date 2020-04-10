package com.cdsxt.ego.rpc.service;

import com.cdsxt.ego.beans.EgoResult;
import com.cdsxt.ego.beans.PageResult;
import com.cdsxt.ego.rpc.pojo.TbItem;
import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbItemExample;
public interface TbItemService{

    /**
     * 实现商品信息的分页查询
     * @param page
     * @param rows
     * @return
     */
    PageResult<TbItem> selectItemList(Integer page, Integer rows);
    /**
     * 完成商品上下架状态的修改
     * @return
     */
    EgoResult updateItemService(List<Long> itemIds, Boolean flag);

    long countByExample(TbItemExample example);

    int deleteByExample(TbItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    List<TbItem> selectByExample(TbItemExample example);

    TbItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbItem record,TbItemExample example);

    int updateByExample(TbItem record,TbItemExample example);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);

    EgoResult deleteItemService(List<Long> itemIds);
}

