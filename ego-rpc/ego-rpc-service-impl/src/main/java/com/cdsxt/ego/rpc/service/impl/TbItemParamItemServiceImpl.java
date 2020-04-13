package com.cdsxt.ego.rpc.service.impl;

import com.cdsxt.ego.beans.EgoResult;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbItemParamItemExample;
import com.cdsxt.ego.rpc.pojo.TbItemParamItem;
import com.cdsxt.ego.rpc.mapper.TbItemParamItemMapper;
import com.cdsxt.ego.rpc.service.TbItemParamItemService;
@Service
public class TbItemParamItemServiceImpl implements TbItemParamItemService{

    @Resource
    private TbItemParamItemMapper tbItemParamItemMapper;

    @Override
    public long countByExample(TbItemParamItemExample example) {
        return tbItemParamItemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbItemParamItemExample example) {
        return tbItemParamItemMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbItemParamItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbItemParamItem record) {
        return tbItemParamItemMapper.insert(record);
    }

    @Override
    public int insertSelective(TbItemParamItem record) {
        return tbItemParamItemMapper.insertSelective(record);
    }

    @Override
    public List<TbItemParamItem> selectByExample(TbItemParamItemExample example) {
        return tbItemParamItemMapper.selectByExample(example);
    }

    @Override
    public TbItemParamItem selectByPrimaryKey(Long id) {
        return tbItemParamItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbItemParamItem record,TbItemParamItemExample example) {
        return tbItemParamItemMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbItemParamItem record,TbItemParamItemExample example) {
        return tbItemParamItemMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbItemParamItem record) {
        return tbItemParamItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbItemParamItem record) {
        return tbItemParamItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public EgoResult queryByItemCatId(Long id) {

        TbItemParamItem tbItemParamItem = tbItemParamItemMapper.selectByPrimaryKey(id);
        EgoResult ok = EgoResult.ok();
//        ok.setData();
        return ok;
    }

}
