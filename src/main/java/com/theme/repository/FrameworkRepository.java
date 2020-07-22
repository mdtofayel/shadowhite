package com.theme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.theme.domain.Frameworks;



@Repository("frameworkRepository")
public interface FrameworkRepository extends JpaRepository<Frameworks, Integer> {
	Frameworks findById(Integer id);
	
	@Query(value ="SELECT * FROM frameworks t WHERE t.catagories_id = :catId AND t.name =:name",
			nativeQuery =true)
	Frameworks checkUniqueNessOfChild(@Param("catId") int parentId, @Param("name")String name);
	
	
}
