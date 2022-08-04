package com.smart.policeweb.service;

import com.smart.policeweb.model.ModelList;
import com.smart.policeweb.repository.MakeModelListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired
    private MakeModelListRepository makeModelListRepository;

    public List<ModelList> findAll() {
        return makeModelListRepository.findAll();
    }
}
