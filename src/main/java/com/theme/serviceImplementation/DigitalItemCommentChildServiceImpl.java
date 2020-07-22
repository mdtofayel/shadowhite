package com.theme.serviceImplementation;

import com.theme.domain.DigitalItemCommentChild;
import com.theme.repository.DigitalItemCommentChildRepository;
import com.theme.service.DigitalItemCommentChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Tofayel Ahmed on  5/31/17.
 */
@Service
public class DigitalItemCommentChildServiceImpl implements DigitalItemCommentChildService {

    DigitalItemCommentChildRepository digitalItemCommentChildRepository;

    @Autowired
    public void setDigitalItemCommentChildRepository(@Qualifier("digitalItemCommentChildRepository") DigitalItemCommentChildRepository digitalItemCommentChildRepository) {
        this.digitalItemCommentChildRepository = digitalItemCommentChildRepository;
    }

    @Override
    public Iterable<DigitalItemCommentChild> listAllDigitalItemCommentChild() {
        return null;
    }

    @Override
    public DigitalItemCommentChild getDigitalItemCommentChildById(Integer id) {
        return null;
    }

    @Override
    public DigitalItemCommentChild saveDigitalItemCommentChild(DigitalItemCommentChild digitalItems) {
        DigitalItemCommentChild digitalItemCommentChild = digitalItemCommentChildRepository.save(digitalItems);
        return digitalItemCommentChild;
    }

    @Override
    public void deleteDigitalItemCommentChild(Integer id) {

    }
}
