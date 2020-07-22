package com.threeD.serviceImplementation;

import com.threeD.domain.DigitalItemComments;
import com.threeD.repository.DigitalItemCommentsRepository;
import com.threeD.service.DigitalItemCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Tofayel Ahmed on  5/23/17.
 */
@Service("digitalItemCommentsThreeD")
public class DigitalItemCommentsImpl implements DigitalItemCommentsService {


    DigitalItemCommentsRepository digitalItemCommentsRepository;

    @Autowired
    public void setDigitalItemCommentsRepository(@Qualifier("digitalItemCommentsRepositoryThreed") DigitalItemCommentsRepository digitalItemCommentsRepository) {
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

