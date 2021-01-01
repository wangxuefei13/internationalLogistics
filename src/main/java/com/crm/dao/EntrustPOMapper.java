package com.crm.dao;

import com.crm.entity.po.EntrustPO;

public interface EntrustPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(EntrustPO record);

    int insertSelective(EntrustPO record);

    EntrustPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EntrustPO record);

    int updateByPrimaryKey(EntrustPO record);
}