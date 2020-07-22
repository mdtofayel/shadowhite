package com.theme.serviceImplementation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.theme.domain.DigitalItemVersions;
import com.theme.repository.DigitalItemVersionsRepository;
import com.theme.service.DigitalItemVersionsService;

@Service
public class DigitalItemVersionsServiceImpl implements DigitalItemVersionsService{

    DigitalItemVersionsRepository digitalItemVersionsRepository;

    @Autowired
    public void setDigitalItemVersionsRepository(@Qualifier("digitalItemVersionsRepository") DigitalItemVersionsRepository digitalItemVersionsRepository) {
        this.digitalItemVersionsRepository = digitalItemVersionsRepository;
    }

    @Override
    public Iterable<DigitalItemVersions> listAllDigitalItemVersionsScreens() {
        return null;
    }

    @Override
    public DigitalItemVersions getDigitalItemVersionsById(Integer id) {
        return digitalItemVersionsRepository.getOne(id);
    }

    @Override
    public DigitalItemVersions saveDigitalItemVersions(DigitalItemVersions digitalItemVersions) {
        return digitalItemVersionsRepository.save(digitalItemVersions);
    }

    @Override
    public void deleteDigitalItemVersions(Integer id) {

    }
}
