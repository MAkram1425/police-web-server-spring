package com.smart.policeweb.controller;

import com.smart.policeweb.model.ModelList;
import com.smart.policeweb.model.ReasonInterestList;
import com.smart.policeweb.model.ReasonList;
import com.smart.policeweb.model.VIOList;
import com.smart.policeweb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/police")
public class MyRestController {
    @Autowired
    private MyService myService;


    @GetMapping("/getAllModelList")
    public List<ModelList> getAllModelList(){
        return myService.findAllModelList();
    }

    @GetMapping("/findAllReasonList")
    public List<ReasonList> findAllReasonList(){
        return myService.findAllReasonList();
    }

    @GetMapping("/reasonInterestList")
    public List<ReasonInterestList> reasonInterestList(){
        return myService.reasonInterestList();
    }

    @GetMapping("/showAllVOIList")
    public List<VIOList> showAllVOIList(){
        return myService.showAllVOIList();
    }
}
