package com.theme.service;

import com.theme.domain.DigitalItemSoftwareVersions;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */
public interface DigitalItemSoftwareVersionsService {
    Iterable<DigitalItemSoftwareVersions> listAllDigitalItemSoftwareVersions();
    DigitalItemSoftwareVersions getDigitalItemSoftwareVersionsById(Integer id);
    DigitalItemSoftwareVersions saveDigitalItemSoftwareVersions(DigitalItemSoftwareVersions digitalItemSoftwareVersions);
    void deleteDigitalItemSoftwareVersions(Integer id);
}
