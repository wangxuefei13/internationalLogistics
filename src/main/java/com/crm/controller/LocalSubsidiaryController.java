package com.crm.controller;

import com.crm.entity.po.EnquiryPlacePO;
import com.crm.entity.po.PersonPO;
import com.crm.service.EnquiryPlaceService;
import com.crm.service.PersonService;
import com.crm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 *  这是地方子公司的控制类
 */
@RestController
public class LocalSubsidiaryController {
    @Autowired
    private EnquiryPlaceService enquiryPlaceService;

    @Autowired
    private PersonService personService;


    //搜索栏搜搜索询价单
    @RequestMapping("/EnquiryPlaceSelect")
    public R EnquiryPlaceSelect(@RequestBody EnquiryPlacePO enquiryPlacePO,
            @RequestParam(value = "oneTime",required = false) String oneTime,//时间1和时间2是发货时间的范围
            @RequestParam(value = "towTime",required = false) String towTime
    ){
        System.out.println("进入查询-----"+enquiryPlacePO.getProductName());
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("enquiryPlacePO",enquiryPlacePO);
        map.put("poneTime", oneTime);
        map.put("towTime", towTime);

        List<EnquiryPlacePO> list = enquiryPlaceService.EnquiryPlaceSelect(map);
        return R.ok().data("list",list);
    }
/**
 * 新建一张询价单
 * @return
 */
    @RequestMapping("/EnquiryPlaceInsert")
    public R EnquiryPlaceInsert(@RequestBody EnquiryPlacePO enquiryPlacePO){
        System.out.println("进入添加-----"+enquiryPlacePO);
        R r = enquiryPlaceService.EnquiryPlaceInsert(enquiryPlacePO);
        return r;
    }

/**
 * 注册
 * @return
 */
    @RequestMapping("/register")
    public String register(PersonPO personPO, Model model){
        String uuid = UUID.randomUUID().toString();
        personPO.setId(uuid);
        personPO.setEntryTime(new Date());
        personPO.setStruts(1);
        R r = personService.savePerson(personPO);
        if(r.getSuccess()){
            return "login";
        }
        model.addAttribute("R",r);
        return "register";
    }

}
