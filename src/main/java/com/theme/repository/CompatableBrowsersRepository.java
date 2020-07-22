package com.theme.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.theme.domain.CompatableBrowsers;


@Repository("compatableBrowsersRepository")
public interface CompatableBrowsersRepository extends JpaRepository<CompatableBrowsers, Integer> {

	CompatableBrowsers findByName(String name);

	@Query(value = "SELECT name FROM compatable_browsers", nativeQuery = true)
	Optional<List<String>> findAllName();
	
	@Query(
			value = "SELECT * FROM compatable_browsers t where t.catagories_id = :catId AND t.name = :name",
			nativeQuery=true
	)
	CompatableBrowsers checkUniqueNessOfChild(@Param("catId") int parentId,
									@Param("name") String name);


}
