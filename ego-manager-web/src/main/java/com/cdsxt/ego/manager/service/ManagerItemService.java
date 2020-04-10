package com.cdsxt.ego.manager.service;

import com.cdsxt.ego.beans.EgoResult;
import com.cdsxt.ego.beans.PageResult;
import com.cdsxt.ego.rpc.pojo.TbItem;

public interface ManagerItemService {
    /**
     * 完成商品信息的分页查询
     * @param page
     * @param rows
     * @return
     */
    public PageResult<TbItem> selectItemListService(Integer page,Integer rows);
    /**
     *  完成商品的上架
     * @param ids
     * @return
     */
    public EgoResult reshelfItem(Long[]ids);

    /**
     *  完成商品的下架
     * @param ids
     * @return
     */
    public EgoResult instockItem(Long[]ids);

    EgoResult deleteItems(Long[] ids);
}
