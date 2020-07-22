package com.threeD.repository;

import com.threeD.domain.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("supportRepositoryThreeD")
public interface SupportRepository extends JpaRepository<Support, Integer> {

}
