package com.threeD.repository;

import com.threeD.domain.Categories;
import com.threeD.domain.CreateIn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository("categoriesRepositoryThreeD")
public interface CategoriesRepository extends JpaRepository<Categories,Integer> {
    Categories findById(Integer id);
    Categories findByName(String name);


    @Query(
            value = "SELECT name FROM categories",
            nativeQuery=true
    )
    Optional<List<String>> findAllName();
    /*@Query(
			value = "SELECT * FROM created_in t where t.parent_id= :parentId AND t.name = :name",
			nativeQuery=true
	)
	Categories checkUniqueNessOfParents(@Param("parentId") int parentId, @Param("name") String name);
*/
}
