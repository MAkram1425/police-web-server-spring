package com.smart.policeweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class MyController {

    @GetMapping
    public String home(Model model){
        return "index";
    }
    @GetMapping("/reason-list")
    public String reasonList(Model model){
        return "ReasonList";
    }
    @GetMapping("/interest-list")
    public String interestList(Model model){
        return "InterestList";
    }
    @GetMapping("/vio-list")
    public String vioList(Model model){
        return "VIOList";
    }
}
