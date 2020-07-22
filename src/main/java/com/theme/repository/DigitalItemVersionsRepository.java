package com.theme.repository;

import com.theme.domain.DigitalItemVersions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("digitalItemVersionsRepository")
public interface DigitalItemVersionsRepository extends JpaRepository<DigitalItemVersions,Integer> {
    DigitalItemVersions findById(Integer id);
}
