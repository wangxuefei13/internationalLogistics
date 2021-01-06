package com.crm.service.impl;


import com.crm.dao.EnquiryPlacePOMapper;
import com.crm.entity.po.EnquiryPlacePO;
import com.crm.service.EnquiryPlaceService;
import com.crm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EnquiryPlaceServiceImpl implements EnquiryPlaceService {
    @Autowired
    EnquiryPlacePOMapper enquiryPlacePOMapper;
    @Override
    public List<EnquiryPlacePO> EnquiryPlaceSelect( Map<String,Object> map) {
        List<EnquiryPlacePO> list = enquiryPlacePOMapper.EnquirySelectAll(map);
        return list;
    }

    //新建询价单
    @Override
    public R EnquiryPlaceInsert(EnquiryPlacePO enquiryPlacePO) {
        System.out.println("进入service-----"+enquiryPlacePO);
        int insert = enquiryPlacePOMapper.insert(enquiryPlacePO);
        if (insert!=1){
            return R.error();
        }
        return R.ok();
    }

    /**
     *  根据id查询询价单，并修改状态为询价
     * @param id
     * @return
     */
    @Override
    public R selectByPrimaryKeyAndUpdateStatus(String id) {
        EnquiryPlacePO enquiryPlacePO = enquiryPlacePOMapper.selectByPrimaryKey(id);
        if (null != enquiryPlacePO){
            enquiryPlacePO.setStatus(0);
            return enquiryPlacePOMapper.updateByPrimaryKey(enquiryPlacePO)==1?R.ok():R.error();
        }
        return R.error();
    }
}
