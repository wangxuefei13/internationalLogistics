package com.internationalLogistics.mapper;

import com.internationalLogistics.entity.po.CompanyPO;

public interface CompanyPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(CompanyPO record);

    int insertSelective(CompanyPO record);

    CompanyPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CompanyPO record);

    int updateByPrimaryKey(CompanyPO record);
}