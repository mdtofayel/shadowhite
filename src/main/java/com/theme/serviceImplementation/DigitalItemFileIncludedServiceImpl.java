package com.theme.serviceImplementation;

import com.theme.domain.DigitalItemFileIncluded;
import com.theme.repository.DigitalItemFileIncludedRepository;
import com.theme.service.DigitalItemFileIncludedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */

@Service
public class DigitalItemFileIncludedServiceImpl implements DigitalItemFileIncludedService{


    DigitalItemFileIncludedRepository digitalItemFileIncludedRepository;

    @Autowired
    public void setDigitalItemFileIncludedRepository(@Qualifier("digitalItemFileIncludedRepository") DigitalItemFileIncludedRepository digitalItemFileIncludedRepository) {
        this.digitalItemFileIncludedRepository = digitalItemFileIncludedRepository;
    }

    @Override
    public Iterable<DigitalItemFileIncluded> listAllDigitalItemFileIncluded() {
        return null;
    }

    @Override
    public DigitalItemFileIncluded getDigitalItemFileIncludedById(Integer id) {
        return null;
    }

    @Override
    public DigitalItemFileIncluded saveDigitalItemFileIncluded(DigitalItemFileIncluded digitalItemFileIncluded) {
        return digitalItemFileIncludedRepository.save(digitalItemFileIncluded);
    }

    @Override
    public void deleteDigitalItemFileIncluded(Integer id) {
        digitalItemFileIncludedRepository.delete(id);
    }
}
