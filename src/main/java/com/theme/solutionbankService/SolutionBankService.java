package com.theme.solutionbankService;


import java.util.List;

import com.theme.solutionbankDomain.SolutionBank;


public interface SolutionBankService {
	
	List<SolutionBank> listAllSolutionBank();
	SolutionBank getSolutionBankById(Integer id);
	SolutionBank saveSolutionBank(SolutionBank solutionBank );
    void deleteSolutionBank(Integer id);
	
	

}
