package com.theme.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theme.domain.CompatibleWith;
import com.theme.repository.CompatibleWithRepository;
import com.theme.service.CompatibleWithService;

@Service
public class CompatibleWithServiceImpl implements CompatibleWithService {

	
		@Autowired
		CompatibleWithRepository compatibleWithRepository;
	@Override
	public List<CompatibleWith> listAllCompatibleWith() {
		// TODO Auto-generated method stub
		return compatibleWithRepository.findAll();
	}

	@Override
	public CompatibleWith getCompatibleWithById(Integer id) {
		// TODO Auto-generated method stub
		return compatibleWithRepository.findOne(id);
	}

	@Override
	public CompatibleWith saveCompatibleWith(CompatibleWith compatibleWith) {
		// TODO Auto-generated method stub
		return compatibleWithRepository.save(compatibleWith);
	}

	@Override
	public void deleteCompatibleWith(Integer id) {
		// TODO Auto-generated method stub
		compatibleWithRepository.delete(id);
		
	}

	@Override
	public Optional<List<String>> listOfCompatibleWith() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompatibleWith findByCompatibleWith(String compatibleWith) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompatibleWith checkUniqueNessOfChild(Integer parentId, String name) {
		// TODO Auto-generated method stub
		return compatibleWithRepository.checkUniqueNessOfChild(parentId, name);
	}

}
