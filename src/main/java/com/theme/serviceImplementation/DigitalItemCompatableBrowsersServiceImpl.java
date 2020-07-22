package com.theme.serviceImplementation;

import com.theme.domain.DigitalItemCompatableBrowsers;
import com.theme.repository.DigitalItemCompatableBrowsersRepository;
import com.theme.service.DigitalItemCompatableBrowsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */
@Service
public class DigitalItemCompatableBrowsersServiceImpl implements DigitalItemCompatableBrowsersService {


    DigitalItemCompatableBrowsersRepository digitalItemCompatableBrowsersRepository;

    @Autowired
    public void setDigitalItemCompatableBrowsersRepository(@Qualifier("digitalItemCompatableBrowsersRepository") DigitalItemCompatableBrowsersRepository digitalItemCompatableBrowsersRepository) {
        this.digitalItemCompatableBrowsersRepository = digitalItemCompatableBrowsersRepository;
    }

    @Override
    public Iterable<DigitalItemCompatableBrowsers> listAllDigitalItemCompatableBrowsers() {
        return null;
    }

    @Override
    public DigitalItemCompatableBrowsers getDigitalItemCompatableBrowsersById(Integer id) {
        return null;
    }

    @Override
    public DigitalItemCompatableBrowsers saveDigitalItemCompatableBrowsers(DigitalItemCompatableBrowsers digitalItemCompatableBrowsers) {
        return digitalItemCompatableBrowsersRepository.save(digitalItemCompatableBrowsers);
    }

    @Override
    public void deleteDigitalItemCompatableBrowsers(Integer id) {
        digitalItemCompatableBrowsersRepository.delete(id);
    }
}
