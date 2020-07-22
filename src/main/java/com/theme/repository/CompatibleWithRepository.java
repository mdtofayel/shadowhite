package com.theme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.theme.domain.CompatibleWith;

@Repository("compatibleWothRepository")
public interface CompatibleWithRepository extends JpaRepository< CompatibleWith, Integer> {
	

	
	@Query(
			value = "SELECT * FROM compatible_with t where t.catagories_id = :catId AND t.name = :name",
			nativeQuery= true
		)
	CompatibleWith checkUniqueNessOfChild(@Param("catId") int parentId, @Param("name") String name);
}
