package com.epam.rd.onlineStore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

//@RestController
@Controller
public class ProductController {

    //@GetMapping("/")
    @RequestMapping("/")
    public String index()
    {
        //model.put("time", new Date());
        //model.addAttribute("employees", manager.getAllEmployees());
        //return "employeesListDisplay";
        return "index";
        //ModelAndView modelAndView = new ModelAndView();
        //return modelAndView;
    }



}
