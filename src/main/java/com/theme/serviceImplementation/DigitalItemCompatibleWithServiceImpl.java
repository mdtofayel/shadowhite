package com.theme.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.theme.domain.DigitalItemCompatibleWith;
import com.theme.repository.DigitalItemCompatibleWithRepository;
import com.theme.service.DigitalItemCompatibleWithService;

/**
 * Created by Tofayel Ahmed on  8/13/17.
 */
@Service
public class DigitalItemCompatibleWithServiceImpl implements DigitalItemCompatibleWithService {

    @Qualifier("digitalItemCompatibleWithRepository")
    @Autowired
    DigitalItemCompatibleWithRepository digitalItemCompatibleWithRepository;


    @Override
    public List<DigitalItemCompatibleWith> listAllDigitalItemCompatibleWith() {
        return digitalItemCompatibleWithRepository.findAll();
    }

    @Override
    public DigitalItemCompatibleWith getDigitalItemCompatibleWithById(Integer id) {
        return digitalItemCompatibleWithRepository.getOne(id);
    }

    @Override
    public DigitalItemCompatibleWith saveDigitalItemCompatibleWith(DigitalItemCompatibleWith digitalItemCompatibleWith) {
        return digitalItemCompatibleWithRepository.save(digitalItemCompatibleWith);
    }

    @Override
    public void deleteDigitalItemCompatibleWith(Integer id) {
        digitalItemCompatibleWithRepository.delete(id);
    }
}
