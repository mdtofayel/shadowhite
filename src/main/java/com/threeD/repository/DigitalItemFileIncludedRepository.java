package com.threeD.repository;

import com.threeD.domain.DigitalItemFileIncluded;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */
@Repository("digitalItemFileIncludedRepositoryThreed")
public interface DigitalItemFileIncludedRepository extends JpaRepository<DigitalItemFileIncluded,Integer> {
}
