package com.theme.repository;

import com.theme.domain.DigitalItemCompatableBrowsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */
@Repository("digitalItemCompatableBrowsersRepository")
public interface DigitalItemCompatableBrowsersRepository extends JpaRepository<DigitalItemCompatableBrowsers,Integer> {
}
