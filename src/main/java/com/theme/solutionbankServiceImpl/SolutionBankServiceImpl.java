package com.theme.solutionbankServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theme.solutionbankDomain.SolutionBank;
import com.theme.solutionbankRepository.SolutionBankRepository;
import com.theme.solutionbankService.SolutionBankService;


@Service
public class SolutionBankServiceImpl implements SolutionBankService {
	
	@Autowired
	SolutionBankRepository solutionBankRepository;

	@Override
	public List<SolutionBank> listAllSolutionBank() {
		// TODO Auto-generated method stub
		return solutionBankRepository.findAll();
	}

	@Override
	public SolutionBank getSolutionBankById(Integer id) {
		// TODO Auto-generated method stub
		return solutionBankRepository.getOne(id);
	}

	@Override
	public SolutionBank saveSolutionBank(SolutionBank solutionBank) {
		// TODO Auto-generated method stub
		return  solutionBankRepository.save(solutionBank);
		        
	}

	@Override
	public void deleteSolutionBank(Integer id) {
		solutionBankRepository.delete(id);
		
	}



}
