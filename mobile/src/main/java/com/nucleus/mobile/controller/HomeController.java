package com.nucleus.mobile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping(value="/")
    public String index()
    {
        return "index";
    }

    @GetMapping(value="/home")
    public String index1()
    {
        return "index1";
    }

    @GetMapping(value = "/allsee")
    public String allsee(){return "allsee";}



    @GetMapping(value = "/insert")
    public String insert(){return "insert";}

    @GetMapping(value = "/delete")
    public String delete(){return "delete";}

    @GetMapping(value = "/seebybrand")
    public String seebybrand(){return "seebybrand";}

    @GetMapping(value = "/update")
    public String update(){return "update";}

}