package com.theme.serviceImplementation;

import com.theme.domain.DigitalItemSoftwareVersions;
import com.theme.repository.DigitalItemSoftwareVersionsRepository;
import com.theme.service.DigitalItemSoftwareVersionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */
@Service
public class DigitalItemSoftwareVersionsServiceImpl implements DigitalItemSoftwareVersionsService {

    DigitalItemSoftwareVersionsRepository digitalItemSoftwareVersionsRepository;


    @Autowired
    public void setDigitalItemSoftwareVersionsRepository(@Qualifier("digitalItemSoftwareVersionsRepository") DigitalItemSoftwareVersionsRepository digitalItemSoftwareVersionsRepository) {
        this.digitalItemSoftwareVersionsRepository = digitalItemSoftwareVersionsRepository;
    }

    @Autowired


    @Override
    public Iterable<DigitalItemSoftwareVersions> listAllDigitalItemSoftwareVersions() {
        return null;
    }

    @Override
    public DigitalItemSoftwareVersions getDigitalItemSoftwareVersionsById(Integer id) {
        return null;
    }

    @Override
    public DigitalItemSoftwareVersions saveDigitalItemSoftwareVersions(DigitalItemSoftwareVersions digitalItemSoftwareVersions) {
        return digitalItemSoftwareVersionsRepository.save(digitalItemSoftwareVersions);
    }

    @Override
    public void deleteDigitalItemSoftwareVersions(Integer id) {
        digitalItemSoftwareVersionsRepository.delete(id);
    }
}
