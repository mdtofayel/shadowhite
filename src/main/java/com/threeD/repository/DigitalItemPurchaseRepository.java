package com.threeD.repository;

import com.threeD.domain.DigitalItemPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  5/23/17.
 */

@Repository("digitalItemPurchaseRepositoryThreeD")
public interface DigitalItemPurchaseRepository extends JpaRepository<DigitalItemPurchase,Integer> {


}
