package com.threeD.service;


import com.threeD.domain.DigitalItemVersions;

/**
 * Created by Tofayel Ahmed on  6/4/17.
 */
public interface DigitalItemVersionsService {
    Iterable<DigitalItemVersions> listAllDigitalItemVersionsScreens();
    DigitalItemVersions getDigitalItemVersionsById(Integer id);
    DigitalItemVersions saveDigitalItemVersions(DigitalItemVersions digitalItemVersions);
    void deleteDigitalItemVersions(Integer id);
}
