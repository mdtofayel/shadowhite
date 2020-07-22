package com.theme.repository;

import com.theme.domain.DigitalItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tofayel Ahmed on  5/11/17.
 */
@Repository("digitalItemsRepositoy")
public interface DigitalItemsRepositoy extends JpaRepository<DigitalItems,Integer> {
//    DigitalItems findById(Integer id);

    List<DigitalItems> findByPrice(Integer price);

    DigitalItems findDigitalItemsByName(String name);

    List<DigitalItems> findAllByOrderByIdDesc();

//    @Query(
//            value = "SELECT id FROM digital_items t where t.price = :price",
//            nativeQuery=true
//    )
//    public Optional<List<Integer>> findByPrice(@Param("price") int price);

}
