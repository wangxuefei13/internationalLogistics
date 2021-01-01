package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/person")
    private String test(@RequestBody Person person, @RequestParam("companyName") String company){

        System.out.println(person.getRegisterName());

        System.out.println(person.getBirthday());

        System.out.println(company);

        return "success";
    }

}
