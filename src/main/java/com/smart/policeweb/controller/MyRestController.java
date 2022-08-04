package com.smart.policeweb.controller;

import com.smart.policeweb.model.ModelList;
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


    @GetMapping("/getAll")
    public List<ModelList> getAllModelList(){
        return myService.findAll();
    }
}
