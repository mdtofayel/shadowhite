package com.threeD.service;


import com.threeD.domain.DigitalItemPurchase;

public interface DigitalItemPurchaseService {
    Iterable<DigitalItemPurchase> listAllDigitalItemPurchase();
    DigitalItemPurchase getDigitalItemPurchaseById(Integer id);
    DigitalItemPurchase saveDigitalItemPurchase(DigitalItemPurchase digitalItems);
    void deleteDigitalItemPurchase(Integer id);
}
