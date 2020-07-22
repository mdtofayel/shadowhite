package com.theme.repository;

import com.theme.domain.DigitalItemCompatibleWith;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  8/13/17.
 */
@Repository("digitalItemCompatibleWithRepository")
public interface DigitalItemCompatibleWithRepository extends JpaRepository<DigitalItemCompatibleWith, Integer>{
}
