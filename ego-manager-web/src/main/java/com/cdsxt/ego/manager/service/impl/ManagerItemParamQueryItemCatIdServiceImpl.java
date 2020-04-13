package com.cdsxt.ego.manager.service.impl;

import com.cdsxt.ego.beans.EgoResult;
import com.cdsxt.ego.manager.service.ManagerItemParamQueryItemCatIdService;
import com.cdsxt.ego.rpc.service.TbItemParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("managerItemParamQueryItemCatIdService")
public class ManagerItemParamQueryItemCatIdServiceImpl implements ManagerItemParamQueryItemCatIdService {
    @Autowired
    private TbItemParamItemService itemParamItemServiceProxy;

    public ManagerItemParamQueryItemCatIdServiceImpl() {
    }

    public EgoResult queryByItemCatId(Long id) {
        return this.itemParamItemServiceProxy.queryByItemCatId(id);
    }
}
