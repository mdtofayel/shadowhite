package com.threeD.serviceImplementation;


import com.threeD.domain.DigitalItemPurchase;
import com.threeD.repository.DigitalItemPurchaseRepository;
import com.threeD.service.DigitalItemPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("digitalItemPurchaseServiceThreeD")
public class DigitalItemPurchaseServiceImpl implements DigitalItemPurchaseService {

    DigitalItemPurchaseRepository digitalItemPurchaseRepository;

    @Autowired
    public void setDigitalItemPurchaseRepository(@Qualifier("digitalItemPurchaseRepositoryThreeD") DigitalItemPurchaseRepository digitalItemPurchaseRepository) {
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
