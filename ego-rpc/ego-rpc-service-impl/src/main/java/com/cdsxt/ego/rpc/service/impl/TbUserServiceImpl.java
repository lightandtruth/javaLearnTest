package com.cdsxt.ego.rpc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbUserExample;
import com.cdsxt.ego.rpc.pojo.TbUser;
import com.cdsxt.ego.rpc.mapper.TbUserMapper;
import com.cdsxt.ego.rpc.service.TbUserService;
@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public long countByExample(TbUserExample example) {
        return tbUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbUserExample example) {
        return tbUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbUser record) {
        return tbUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TbUser record) {
        return tbUserMapper.insertSelective(record);
    }

    @Override
    public List<TbUser> selectByExample(TbUserExample example) {
        return tbUserMapper.selectByExample(example);
    }

    @Override
    public TbUser selectByPrimaryKey(Long id) {
        return tbUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbUser record,TbUserExample example) {
        return tbUserMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbUser record,TbUserExample example) {
        return tbUserMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbUser record) {
        return tbUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbUser record) {
        return tbUserMapper.updateByPrimaryKey(record);
    }

}
