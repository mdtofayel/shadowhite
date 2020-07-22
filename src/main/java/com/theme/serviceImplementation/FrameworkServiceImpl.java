package com.theme.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.theme.domain.Frameworks;
import com.theme.repository.FrameworkRepository;
import com.theme.service.FrameworkService;

@Service
public class FrameworkServiceImpl implements FrameworkService {

	FrameworkRepository frameworkRepository;

	@Autowired
	public void setFrameworkRepository(@Qualifier("frameworkRepository") FrameworkRepository frameworkRepository) {
		this.frameworkRepository = frameworkRepository;
	}

	@Override
	public List<Frameworks> listAllframeworks() {
		return frameworkRepository.findAll();
	}

	@Override
	public Frameworks getframeworksById(Integer id) {
		return frameworkRepository.findOne(id);
	}

	@Override
	public Frameworks saveframeworks(Frameworks frameworks) {
		return frameworkRepository.save(frameworks);
	}

	@Override
	public void deleteframeworks(Integer id) {
		frameworkRepository.delete(id);
	}

	@Override
	public Frameworks checkUniqueNessOfChild(Integer parentId, String name) {
		// TODO Auto-generated method stub
		return frameworkRepository.checkUniqueNessOfChild(parentId, name);
	}

}
