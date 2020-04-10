package com.cdsxt.ego.rpc.service;

import java.util.List;
import com.cdsxt.ego.rpc.pojo.TbUserExample;
import com.cdsxt.ego.rpc.pojo.TbUser;
public interface TbUserService{


    long countByExample(TbUserExample example);

    int deleteByExample(TbUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);

    TbUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbUser record,TbUserExample example);

    int updateByExample(TbUser record,TbUserExample example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

}
