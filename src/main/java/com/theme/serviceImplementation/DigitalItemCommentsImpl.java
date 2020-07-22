package com.theme.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theme.domain.DigitalItemComments;
import com.theme.repository.DigitalItemCommentsRepository;
import com.theme.service.DigitalItemCommentsService;

/**
 * Created by Tofayel Ahmed on  5/23/17.
 */
@Service
public class DigitalItemCommentsImpl implements DigitalItemCommentsService {


    DigitalItemCommentsRepository digitalItemCommentsRepository;

    @Autowired
    public void setDigitalItemCommentsRepository(DigitalItemCommentsRepository digitalItemCommentsRepository) {
        this.digitalItemCommentsRepository = digitalItemCommentsRepository;
    }


    @Override
    public Iterable<DigitalItemComments> listAllDigitalItemComments() {
        return digitalItemCommentsRepository.findAll();
    }

    @Override
    public DigitalItemComments getDigitalItemCommentsById(Integer id) {
        DigitalItemComments digitalItemComments = digitalItemCommentsRepository.findById(id);
        return digitalItemComments;
    }

    @Override
    public DigitalItemComments saveDigitalItemComments(DigitalItemComments digitalItems) {
        return digitalItemCommentsRepository.save(digitalItems);
    }

    @Override
    public void deleteDigitalItemComments(Integer id) {

    }

}

