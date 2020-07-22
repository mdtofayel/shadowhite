package com.theme.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.theme.domain.Categories;





@Repository("categoriesRepository")
public interface CategoriesRepository extends JpaRepository<Categories,Integer> {
    Categories findById(Integer id);
    Categories findByName(String name);


    @Query(
            value = "SELECT name FROM categories",
            nativeQuery=true
    )
    Optional<List<String>> findAllName();

}
