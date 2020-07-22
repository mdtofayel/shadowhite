package com.threeD.service;

import com.threeD.domain.DigitalItemFileIncluded;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */
public interface DigitalItemFileIncludedService {

    Iterable<DigitalItemFileIncluded> listAllDigitalItemFileIncluded();
    DigitalItemFileIncluded getDigitalItemFileIncludedById(Integer id);
    DigitalItemFileIncluded saveDigitalItemFileIncluded(DigitalItemFileIncluded digitalItemFileIncluded);
    void deleteDigitalItemFileIncluded(Integer id);
}
