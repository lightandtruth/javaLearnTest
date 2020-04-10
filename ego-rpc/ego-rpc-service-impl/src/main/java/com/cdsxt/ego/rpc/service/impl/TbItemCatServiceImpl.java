package com.cdsxt.ego.rpc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cdsxt.ego.rpc.mapper.TbItemCatMapper;
import com.cdsxt.ego.rpc.pojo.TbItemCat;
import com.cdsxt.ego.rpc.pojo.TbItemCatExample;
import com.cdsxt.ego.rpc.service.TbItemCatService;
@Service
public class TbItemCatServiceImpl implements TbItemCatService{

    @Resource
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public long countByExample(TbItemCatExample example) {
        return tbItemCatMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbItemCatExample example) {
        return tbItemCatMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbItemCatMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbItemCat record) {
        return tbItemCatMapper.insert(record);
    }

    @Override
    public int insertSelective(TbItemCat record) {
        return tbItemCatMapper.insertSelective(record);
    }

    @Override
    public List<TbItemCat> selectByExample(TbItemCatExample example) {
        return tbItemCatMapper.selectByExample(example);
    }

    @Override
    public TbItemCat selectByPrimaryKey(Long id) {
        return tbItemCatMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbItemCat record,TbItemCatExample example) {
        return tbItemCatMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbItemCat record,TbItemCatExample example) {
        return tbItemCatMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbItemCat record) {
        return tbItemCatMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbItemCat record) {
        return tbItemCatMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TbItemCat> getItemCatListByParentId(Long id) {
        // TODO Auto-generated method stub
        //创建TbItemCatExample对象
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria c = example.createCriteria();
        //where parent_id=?
        c.andParentIdEqualTo(id);
        List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
        return list;
    }
}
