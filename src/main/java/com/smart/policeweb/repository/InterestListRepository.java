package com.smart.policeweb.repository;

import com.smart.policeweb.model.ReasonInterestList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestListRepository extends JpaRepository<ReasonInterestList, Long> {
}
