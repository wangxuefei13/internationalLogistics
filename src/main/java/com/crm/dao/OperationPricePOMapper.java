package com.crm.dao;

import com.crm.entity.po.OperationPricePO;

public interface OperationPricePOMapper {
    int deleteByPrimaryKey(String id);

    int insert(OperationPricePO record);

    int insertSelective(OperationPricePO record);

    OperationPricePO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OperationPricePO record);

    int updateByPrimaryKey(OperationPricePO record);
}