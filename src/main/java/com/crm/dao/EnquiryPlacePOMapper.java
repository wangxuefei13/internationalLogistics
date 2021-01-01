package com.crm.dao;

import com.crm.entity.po.EnquiryPlacePO;

public interface EnquiryPlacePOMapper {
    int deleteByPrimaryKey(String id);

    int insert(EnquiryPlacePO record);

    int insertSelective(EnquiryPlacePO record);

    EnquiryPlacePO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EnquiryPlacePO record);

    int updateByPrimaryKey(EnquiryPlacePO record);
}