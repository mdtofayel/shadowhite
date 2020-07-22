package com.threeD.serviceImplementation;

import com.threeD.domain.DigitalItemCreateIn;
import com.threeD.repository.DigitalItemCreateInRepository;
import com.threeD.service.DigitalItemCreateInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */
@Service("digitalItemCreateInServiceThreeD")
public class DigitalItemCreateInServiceImpl implements DigitalItemCreateInService {


    DigitalItemCreateInRepository digitalItemCreateInRepository;

    @Autowired
    public void setDigitalItemCompatableBrowsersRepository(@Qualifier("digitalItemCreateInRepositoryThreed") DigitalItemCreateInRepository digitalItemCompatableBrowsersRepository) {
        this.digitalItemCreateInRepository = digitalItemCompatableBrowsersRepository;
    }

    @Override
    public Iterable<DigitalItemCreateIn> listAllDigitalItemDigitalItemCreateIn() {
        return null;
    }

    @Override
    public DigitalItemCreateIn getDigitalItemDigitalItemCreateInById(Integer id) {
        return null;
    }

    @Override
    public DigitalItemCreateIn saveDigitalItemDigitalItemCreateIn(DigitalItemCreateIn digitalItemDigitalItemCreateIn) {
        return digitalItemCreateInRepository.save(digitalItemDigitalItemCreateIn);
    }

    @Override
    public void deleteDigitalItemDigitalItemCreateIn(Integer id) {
    	digitalItemCreateInRepository.delete(id);
    }
}
