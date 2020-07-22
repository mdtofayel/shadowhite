package com.theme.service;

import com.theme.domain.DigitalItemTags;

/**
 * Created by Tofayel Ahmed on  7/12/17.
 */
public interface DigitalItemTagsService {
    Iterable<DigitalItemTags> listAllDigitalItemTags();
    DigitalItemTags getDigitalItemTagsById(Integer id);
    DigitalItemTags saveDigitalItemTags(DigitalItemTags digitalItemTags);
    void deleteDigitalItemTags(DigitalItemTags id);
}
