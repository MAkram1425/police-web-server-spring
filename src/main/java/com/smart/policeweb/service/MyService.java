package com.smart.policeweb.service;

import com.smart.policeweb.model.ModelList;
import com.smart.policeweb.model.ReasonInterestList;
import com.smart.policeweb.model.ReasonList;
import com.smart.policeweb.model.VIOList;
import com.smart.policeweb.repository.InterestListRepository;
import com.smart.policeweb.repository.MakeModelListRepository;
import com.smart.policeweb.repository.ReasonListRepository;
import com.smart.policeweb.repository.VIOListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired
    private MakeModelListRepository makeModelListRepository;

    @Autowired
    private ReasonListRepository reasonListRepository;

    @Autowired
    private InterestListRepository interestListRepository;

    @Autowired
    private VIOListRepository vioListRepository;

    public List<ModelList> findAllModelList() {
        return makeModelListRepository.findAll();
    }

    public List<ReasonList> findAllReasonList() {
        return reasonListRepository.findAll();
    }

    public List<ReasonInterestList> reasonInterestList() {
        return interestListRepository.findAll();
    }
    public List<VIOList> showAllVOIList() {
        return vioListRepository.findAll();
    }
}
