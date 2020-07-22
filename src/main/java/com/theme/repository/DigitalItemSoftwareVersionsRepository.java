package com.theme.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theme.domain.DigitalItemSoftwareVersions;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */
@Repository("digitalItemSoftwareVersionsRepository")
public interface DigitalItemSoftwareVersionsRepository extends JpaRepository<DigitalItemSoftwareVersions,Integer> {



}
