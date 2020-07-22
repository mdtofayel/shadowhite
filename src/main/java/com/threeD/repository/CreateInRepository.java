package com.threeD.repository;

import com.threeD.domain.CreateIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("createInRepositoryThreeD")
public interface CreateInRepository extends JpaRepository<CreateIn, Integer> {

	CreateIn findByName(String name);

	@Query(value = "SELECT name FROM created_in", nativeQuery = true)
	Optional<List<String>> findAllName();


	@Query(
			value = "SELECT * FROM created_in t where t.catagories_id = :catId AND t.name = :name",
			nativeQuery=true
	)
	CreateIn checkUniqueNessOfChild(@Param("catId") int parentId,
									@Param("name") String name);

}
