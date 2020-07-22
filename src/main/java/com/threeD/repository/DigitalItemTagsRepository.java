package com.threeD.repository;

import com.threeD.domain.DigitalItemTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  7/12/17.
 */
@Repository("digitalItemTagsRepositoryThreeD")
public interface DigitalItemTagsRepository extends JpaRepository<DigitalItemTags,Integer> {
}
