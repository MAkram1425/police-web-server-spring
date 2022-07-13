package com.smart.policeweb.repository;

import com.smart.policeweb.model.ModelList;
import com.smart.policeweb.model.ReasonInterestList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MakeModelListRepository extends JpaRepository<ModelList, Long> {
}
