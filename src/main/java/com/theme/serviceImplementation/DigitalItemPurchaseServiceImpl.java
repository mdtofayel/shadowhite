package com.theme.serviceImplementation;


import com.theme.domain.DigitalItemPurchase;
import com.theme.repository.DigitalItemPurchaseRepository;
import com.theme.service.DigitalItemPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DigitalItemPurchaseServiceImpl implements DigitalItemPurchaseService {

    DigitalItemPurchaseRepository digitalItemPurchaseRepository;

    @Autowired
    public void setDigitalItemPurchaseRepository(DigitalItemPurchaseRepository digitalItemPurchaseRepository) {
        this.digitalItemPurchaseRepository = digitalItemPurchaseRepository;
    }

    @Override
    public Iterable<DigitalItemPurchase> listAllDigitalItemPurchase() {
        return null;
    }

    @Override
    public DigitalItemPurchase getDigitalItemPurchaseById(Integer id) {
        DigitalItemPurchase digitalItemPurchase = digitalItemPurchaseRepository.findOne(id);
        return digitalItemPurchase;
    }

    @Override
    public DigitalItemPurchase saveDigitalItemPurchase(DigitalItemPurchase digitalItems) {
        return null;
    }

    @Override
    public void deleteDigitalItemPurchase(Integer id) {

    }




}
