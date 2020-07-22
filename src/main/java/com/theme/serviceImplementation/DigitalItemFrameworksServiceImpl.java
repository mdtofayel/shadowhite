package com.theme.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.theme.domain.DigitalItemFrameworks;
import com.theme.repository.DigitalItemFrameworksRepository;
import com.theme.service.DigitalItemFrameworksService;

/**
 * Created by Tofayel Ahmed on  8/13/17.
 */
@Service
public class DigitalItemFrameworksServiceImpl implements DigitalItemFrameworksService{

    @Qualifier("digitalItemFrameworksRepository")
    @Autowired
    DigitalItemFrameworksRepository digitalItemFrameworksRepository;

    @Override
    public List<DigitalItemFrameworks> listAllDigitalItemFrameworks() {
        return digitalItemFrameworksRepository.findAll();
    }

    @Override
    public DigitalItemFrameworks getDigitalItemFrameworksById(Integer id) {
        return digitalItemFrameworksRepository.getOne(id);
    }

    @Override
    public DigitalItemFrameworks saveDigitalItemFrameworks(DigitalItemFrameworks digitalItemFrameworks) {
        return digitalItemFrameworksRepository.save(digitalItemFrameworks);
    }

    @Override
    public void deleteDigitalItemFrameworks(Integer id) {
        digitalItemFrameworksRepository.delete(id);
    }
}
