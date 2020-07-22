package com.theme.serviceImplementation;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.theme.domain.CompatableBrowsers;
import com.theme.repository.CompatableBrowsersRepository;
import com.theme.service.CompatableBrowsersService;



@Service
public class CompatableBrowsersServiceImpl implements CompatableBrowsersService{

    CompatableBrowsersRepository compatableBrowsersRepository;

    @Autowired
    public void setCompatableBrowsersRepository(@Qualifier("compatableBrowsersRepository") CompatableBrowsersRepository compatableBrowsersRepository) {
        this.compatableBrowsersRepository = compatableBrowsersRepository;
    }

    @Override
    public List<CompatableBrowsers> listAllCompatableBrowsers() {
        return compatableBrowsersRepository.findAll();
    }

    @Override
    public CompatableBrowsers getCompatableBrowsersById(Integer id) {
        return compatableBrowsersRepository.findOne(id);
    }

    @Override
    public CompatableBrowsers saveCompatableBrowsers(CompatableBrowsers compatableBrowsers) {
        return compatableBrowsersRepository.save(compatableBrowsers);
    }

    @Override
    public void deleteCompatableBrowsers(Integer id) {
    		compatableBrowsersRepository.delete(id);
    }

    @Override
    public Optional<List<String>> listOfBrowsersName() {
        return compatableBrowsersRepository.findAllName();
    }

    @Override
    public CompatableBrowsers findByBrowsers(String browser) {
        return compatableBrowsersRepository.findByName(browser);
    }

	@Override
	public CompatableBrowsers checkUniqueNessOfChild(Integer parentId, String name) {
		// TODO Auto-generated method stub
		return compatableBrowsersRepository.checkUniqueNessOfChild(parentId, name);
	}
}
