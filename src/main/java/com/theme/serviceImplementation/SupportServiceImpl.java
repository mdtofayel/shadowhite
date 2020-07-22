package com.theme.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theme.domain.Support;
import com.theme.repository.SupportRepository;
import com.theme.service.SupportService;


@Service
public class SupportServiceImpl implements SupportService {

	
	@Autowired
	SupportRepository supportRepository;
	
	@Override
	public List<Support> listAllSupport() {
		// TODO Auto-generated method stub
		return supportRepository.findAll();
	}

	@Override
	public Support getSupportById(Integer id) {
		// TODO Auto-generated method stub
		return supportRepository.findOne(id);
	}

	@Override
	public Support saveSupports(Support support) {
		// TODO Auto-generated method stub
		return supportRepository.save(support);
	}

	@Override
	public void deleteSupports(Integer id) {
		supportRepository.delete(id);
	}

	@Override
	public Optional<List<String>> listOfSupport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Support findBySupportName(String supportName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
