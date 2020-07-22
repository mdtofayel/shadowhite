package com.theme.repository;

import com.theme.domain.DigitalItemTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  7/12/17.
 */
@Repository("digitalItemTagsRepository")
public interface DigitalItemTagsRepository extends JpaRepository<DigitalItemTags,Integer> {
}
