package com.smart.policeweb.controller;

import com.smart.policeweb.repository.InterestListRepository;
import com.smart.policeweb.repository.MakeModelListRepository;
import com.smart.policeweb.repository.ReasonListRepository;
import com.smart.policeweb.repository.VIOListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class MyController {

    @Autowired
    private ReasonListRepository reasonListRepository;

    @Autowired
    private VIOListRepository vioListRepository;

    @Autowired
    private MakeModelListRepository makeModelListRepository;

    @Autowired
    private InterestListRepository interestListRepository;


    @GetMapping
    public String home(Model model){
        return "index";
    }

    @GetMapping("/reason-list")
    public String reasonList(Model model){
        model.addAttribute("reasonList",reasonListRepository.findAll());
        return "ReasonList";
    }

    @GetMapping("/model-list")
    public String modelList(Model model){
        model.addAttribute("modelList",makeModelListRepository.findAll());
        return "ModelList";
    }

    @GetMapping("/interest-list")
    public String interestList(Model model){
        model.addAttribute("interestList",interestListRepository.findAll());
        return "InterestList";
    }

    @GetMapping("/vio-list")
    public String vioList(Model model){
        model.addAttribute("vioList",vioListRepository.findAll());
        return "VIOList";
    }
}
