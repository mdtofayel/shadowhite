package com.theme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theme.domain.Support;



@Repository("supportRepository")
public interface SupportRepository extends JpaRepository<Support, Integer> {

}
