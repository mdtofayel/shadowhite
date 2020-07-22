package com.theme.service;

import com.theme.domain.DigitalItemCompatableBrowsers;


public interface DigitalItemCompatableBrowsersService {

    Iterable<DigitalItemCompatableBrowsers> listAllDigitalItemCompatableBrowsers();
    DigitalItemCompatableBrowsers getDigitalItemCompatableBrowsersById(Integer id);
    DigitalItemCompatableBrowsers saveDigitalItemCompatableBrowsers(DigitalItemCompatableBrowsers digitalItemCompatableBrowsers);
    void deleteDigitalItemCompatableBrowsers(Integer id);


}
