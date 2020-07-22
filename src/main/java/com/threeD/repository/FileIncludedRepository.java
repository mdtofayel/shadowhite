package com.threeD.repository;

import com.threeD.domain.CreateIn;
import com.threeD.domain.FileIncluded;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("fileIncludedRepositoryThreeD")
public interface FileIncludedRepository extends JpaRepository<FileIncluded, Integer> {

	FileIncluded findByName(String name);

	@Query(value = "SELECT name FROM file_included", nativeQuery = true)
	Optional<List<String>> findAllName();

	@Query(
			value = "SELECT * FROM file_included t where t.catagories_id = :catId AND t.name = :name",
			nativeQuery=true
	)
	FileIncluded checkUniqueNessOfChild(@Param("catId") int parentId,
									@Param("name") String name);

}
