package com.threeD.repository;

import com.threeD.domain.DigitalItemCommentChild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  5/31/17.
 */
@Repository("digitalItemCommentChildRepositoryThreeD")
public interface DigitalItemCommentChildRepository  extends JpaRepository<DigitalItemCommentChild,Integer> {

}
