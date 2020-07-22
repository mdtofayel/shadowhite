package com.threeD.repository;

import com.threeD.domain.DigitalItemVersions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("digitalItemVersionsRepositoryThreeD")
public interface DigitalItemVersionsRepository extends JpaRepository<DigitalItemVersions,Integer> {
    DigitalItemVersions findById(Integer id);
}
