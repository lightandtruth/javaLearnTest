package com.cdsxt.ego.manager.service.impl;

import com.cdsxt.ego.beans.TreeNode;
import com.cdsxt.ego.manager.service.ManagerItemCatService;
import com.cdsxt.ego.rpc.pojo.TbItemCat;
import com.cdsxt.ego.rpc.service.TbItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("managerItemCatService")
public class ManagerItemCatServiceImpl implements ManagerItemCatService {
    //注入远程服务的代理对象
    @Autowired
    private TbItemCatService itemCatServiceProxy;
    @Override
    public List<TreeNode> getItemCatList(Long id) {
        // TODO Auto-generated method stub
        //1、调用远程服务的代理对象
        List<TbItemCat> list = itemCatServiceProxy.getItemCatListByParentId(id);
        //2、创建List<TreeNode>集合对象
        List<TreeNode> nodeList = new ArrayList<TreeNode>();
        TreeNode node = null;
        for (TbItemCat cat : list) {
            node = new TreeNode();
            node.setId(cat.getId());
            node.setText(cat.getName());
            node.setState(cat.getIsParent()?"closed":"open");
            nodeList.add(node);
        }
        return nodeList;
    }
}
