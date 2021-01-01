package com.crm.dao;

import com.internationalLogistics.entity.po.OperationEnquiryPO;

public interface OperationEnquiryPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(OperationEnquiryPO record);

    int insertSelective(OperationEnquiryPO record);

    OperationEnquiryPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OperationEnquiryPO record);

    int updateByPrimaryKey(OperationEnquiryPO record);
}