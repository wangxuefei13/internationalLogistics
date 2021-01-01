package com.crm.dao;

import com.crm.entity.po.HousePricePO;

public interface HousePricePOMapper {
    int deleteByPrimaryKey(String id);

    int insert(HousePricePO record);

    int insertSelective(HousePricePO record);

    HousePricePO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HousePricePO record);

    int updateByPrimaryKey(HousePricePO record);
}