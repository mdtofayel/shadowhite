package com.threeD.serviceImplementation;

import com.threeD.domain.DigitalItemTags;
import com.threeD.repository.DigitalItemTagsRepository;
import com.threeD.service.DigitalItemTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by bappy on7/12/17.
 */

@Service("digitalItemTagsServiceThreeD")
public class DigitalItemTagsServiceImpl implements DigitalItemTagsService {

    DigitalItemTagsRepository digitalItemTagsRepository;

    @Autowired
    public void setDigitalItemTagsRepository(@Qualifier("digitalItemTagsRepositoryThreeD") DigitalItemTagsRepository digitalItemTagsRepository) {
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
