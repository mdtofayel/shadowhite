package com.theme.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.theme.domain.SoftwareVersions;
import com.theme.repository.SoftwareVersionsRepository;
import com.theme.service.SoftwareVersionsService;






@Service
public class SoftwareVersionsServiceImpl implements SoftwareVersionsService {

    SoftwareVersionsRepository softwareVersionsRepository;

    @Autowired
    public void setSoftwareVersionsRepository(@Qualifier("softwareVersionsRepository") SoftwareVersionsRepository softwareVersionsRepository) {
        this.softwareVersionsRepository = softwareVersionsRepository;
    }

    @Override
    public List<SoftwareVersions> listAllSoftwareVersions() {
        return softwareVersionsRepository.findAll();
    }

    @Override
    public SoftwareVersions getSoftwareVersionsById(Integer id) {
        return softwareVersionsRepository.findOne(id);
    }

    @Override
    public SoftwareVersions saveSoftwareVersions(SoftwareVersions softwareVersions) {
        return softwareVersionsRepository.save(softwareVersions);
    }

    @Override
    public void deleteSoftwareVersions(Integer id) {
    	softwareVersionsRepository.delete(id);
    }

    @Override
    public Optional<List<String>> listOfSoftwareVersion() {
        return softwareVersionsRepository.findAllVersion();
    }

    @Override
    public SoftwareVersions findByVersion(String versionsName) {
        return softwareVersionsRepository.findByVersion(versionsName);
    }

	@Override
	public SoftwareVersions checkUniqueNessOfChild(Integer parentId, String name) {
		// TODO Auto-generated method stub
		return softwareVersionsRepository.checkUniqueNessOfChild(parentId, name);
	}
}
