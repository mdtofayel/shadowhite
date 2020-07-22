package com.theme.serviceImplementation;

import com.theme.domain.DigitalItemTags;
import com.theme.repository.DigitalItemTagsRepository;
import com.theme.service.DigitalItemTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Tofayel Ahmed on  7/12/17.
 */

@Service
public class DigitalItemTagsServiceImpl implements DigitalItemTagsService{

    DigitalItemTagsRepository digitalItemTagsRepository;

    @Autowired
    public void setDigitalItemTagsRepository(@Qualifier("digitalItemTagsRepository") DigitalItemTagsRepository digitalItemTagsRepository) {
        this.digitalItemTagsRepository = digitalItemTagsRepository;
    }

    @Override
    public Iterable<DigitalItemTags> listAllDigitalItemTags() {
        return null;
    }

    @Override
    public DigitalItemTags getDigitalItemTagsById(Integer id) {
        return null;
    }

    @Override
    public DigitalItemTags saveDigitalItemTags(DigitalItemTags digitalItemTags) {
        return digitalItemTagsRepository.save(digitalItemTags);
    }

    @Override
    public void deleteDigitalItemTags(DigitalItemTags digitalItemTags) {
        digitalItemTagsRepository.delete(digitalItemTags);
    }
}
