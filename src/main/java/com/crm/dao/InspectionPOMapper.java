package com.crm.dao;

import com.internationalLogistics.entity.po.InspectionPO;

public interface InspectionPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(InspectionPO record);

    int insertSelective(InspectionPO record);

    InspectionPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InspectionPO record);

    int updateByPrimaryKey(InspectionPO record);
}