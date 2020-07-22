package com.theme.repository;

import com.theme.domain.DigitalItemFrameworks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  8/13/17.
 */
@Repository("digitalItemFrameworksRepository")
public interface DigitalItemFrameworksRepository extends JpaRepository<DigitalItemFrameworks, Integer>{
}
