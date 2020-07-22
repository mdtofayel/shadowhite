package com.threeD.repository;

import com.threeD.domain.DigitalItemCreateIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */
@Repository("digitalItemCreateInRepositoryThreed")
public interface DigitalItemCreateInRepository extends JpaRepository<DigitalItemCreateIn,Integer> {
}
