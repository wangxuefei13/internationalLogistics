package com.crm.dao;

import com.internationalLogistics.entity.po.PersonPO;

public interface PersonPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(PersonPO record);

    int insertSelective(PersonPO record);

    PersonPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PersonPO record);

    int updateByPrimaryKey(PersonPO record);
}