package com.crm.service;

import com.crm.entity.po.EnquiryPlacePO;
import com.crm.util.R;

import java.util.List;
import java.util.Map;

public interface EnquiryPlaceService {
    public List<EnquiryPlacePO> EnquiryPlaceSelect(Map<String, Object> map);

    public R EnquiryPlaceInsert(EnquiryPlacePO enquiryPlacePO);
}
