package com.crm.controller;

import com.crm.service.EnquiryPlaceService;
import com.crm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 对询价状态进行更新的处理器
 */
@Controller
public class UpdateEnquiryPlaceStatusController {

    @Autowired
    private EnquiryPlaceService enquiryPlaceService;

    /**
     * 发起第一次询价时，询价单状态改变为询价
     */
    @RequestMapping("/firstEnquiry")
    public String firstEnquiry(String id, Model model){
        R r = enquiryPlaceService.selectByPrimaryKeyAndUpdateStatus(id);
        model.addAttribute("R",r);
        return "success";
    }
}
