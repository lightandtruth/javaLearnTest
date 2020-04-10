package com.cdsxt.ego.rpc.service.impl;

import com.cdsxt.ego.beans.EgoResult;
import com.cdsxt.ego.beans.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.cdsxt.ego.rpc.pojo.TbItem;
import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbItemExample;
import com.cdsxt.ego.rpc.mapper.TbItemMapper;
import com.cdsxt.ego.rpc.service.TbItemService;
@Service
public class TbItemServiceImpl implements TbItemService{

    @Resource
    private TbItemMapper tbItemMapper;



    @Override
    public long countByExample(TbItemExample example) {
        return tbItemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbItemExample example) {
        return tbItemMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbItem record) {
        return tbItemMapper.insert(record);
    }

    @Override
    public int insertSelective(TbItem record) {
        return tbItemMapper.insertSelective(record);
    }

    @Override
    public List<TbItem> selectByExample(TbItemExample example) {
        return tbItemMapper.selectByExample(example);
    }

    @Override
    public TbItem selectByPrimaryKey(Long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbItem record,TbItemExample example) {
        return tbItemMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbItem record,TbItemExample example) {
        return tbItemMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbItem record) {
        return tbItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbItem record) {
        return tbItemMapper.updateByPrimaryKey(record);
    }
    @Override
    public PageResult<TbItem> selectItemList(Integer page, Integer rows) {
        // TODO Auto-generated method stub
        //执行分页操作
        Page ps = PageHelper.startPage(page,rows);
        TbItemExample example = new TbItemExample();
        //执行数据库查询操作
        List<TbItem> list = tbItemMapper.selectByExample(example);

        PageResult<TbItem> result = new PageResult<TbItem>();
        result.setRows(list);
        result.setTotal(ps.getTotal());
        return result;


    }

    @Override
    public EgoResult updateItemService(List<Long> itemIds, Boolean flag) {
        //1、创建TbItem对象
        TbItem item = new TbItem();
        if(flag) {
            item.setStatus((byte) 1);
        }else {
            item.setStatus((byte) 2);
        }

        //2、创建TbItemExample的对象，给我们动态产生了where条件
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria c = example.createCriteria();
        //where id in (3,4,5)
        c.andIdIn(itemIds);

        tbItemMapper.updateByExampleSelective(item, example);
        //相当于  where id = ? 只能查询一个，不符合查询要求
        return EgoResult.ok();
    }

    @Override
    public EgoResult deleteItemService(List<Long> itemIds) {
        //2、创建TbItemExample的对象，给我们动态产生了where条件
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria c = example.createCriteria();
        //where id in (3,4,5)
        c.andIdIn(itemIds);
        this.tbItemMapper.deleteByExample(example);
        return EgoResult.ok();
    }

}
