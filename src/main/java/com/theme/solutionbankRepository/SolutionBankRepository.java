package com.theme.solutionbankRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theme.solutionbankDomain.SolutionBank;



@Repository("solutionBankRepository")
public interface SolutionBankRepository extends JpaRepository<SolutionBank, Integer> {

}
