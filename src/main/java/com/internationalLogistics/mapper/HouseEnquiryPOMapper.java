package com.internationalLogistics.mapper;

import com.internationalLogistics.entity.po.HouseEnquiryPO;

public interface HouseEnquiryPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(HouseEnquiryPO record);

    int insertSelective(HouseEnquiryPO record);

    HouseEnquiryPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HouseEnquiryPO record);

    int updateByPrimaryKey(HouseEnquiryPO record);
}