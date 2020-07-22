package com.threeD.repository;


import com.threeD.domain.DigitalItemComments;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  5/23/17.
 */
@Repository("digitalItemCommentsRepositoryThreed")
public interface DigitalItemCommentsRepository extends PagingAndSortingRepository<DigitalItemComments,Integer> {
    DigitalItemComments findById(Integer id);
//    @Query("SELECT dcomment FROM DigitalItemComments dcomment WHERE LOWER(dcomment.comment) = LOWER(:comment)")
//    public List<DigitalItemComments> find(@Param("comment") String comment);

    Page<DigitalItemComments> findById(Pageable var1);

}
