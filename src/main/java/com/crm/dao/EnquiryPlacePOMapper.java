package com.crm.dao;

import com.crm.entity.po.EnquiryPlacePO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
@Mapper
public interface EnquiryPlacePOMapper {

    int deleteByPrimaryKey(String id);

    int insert(EnquiryPlacePO record);

    int insertSelective(EnquiryPlacePO record);

    EnquiryPlacePO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EnquiryPlacePO record);

    int updateByPrimaryKey(EnquiryPlacePO record);

    List<EnquiryPlacePO> EnquirySelectAll(Map<String, Object> map);
}