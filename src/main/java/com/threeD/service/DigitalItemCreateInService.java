package com.threeD.service;

import com.threeD.domain.DigitalItemCreateIn;


public interface DigitalItemCreateInService {

    Iterable<DigitalItemCreateIn> listAllDigitalItemDigitalItemCreateIn();
    DigitalItemCreateIn getDigitalItemDigitalItemCreateInById(Integer id);
    DigitalItemCreateIn saveDigitalItemDigitalItemCreateIn(DigitalItemCreateIn digitalItemDigitalItemCreateIn);
    void deleteDigitalItemDigitalItemCreateIn(Integer id);


}
