package com.theme.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.theme.domain.SoftwareVersions;

@Repository("softwareVersionsRepository")
public interface SoftwareVersionsRepository extends JpaRepository<SoftwareVersions, Integer> {

	SoftwareVersions findById(Integer id);

	SoftwareVersions findByVersion(String version);

	@Query(value = "SELECT version FROM software_versions", nativeQuery = true)
	Optional<List<String>> findAllVersion();
	
	@Query(value ="SELECT * FROM software_versions t WHERE t.catagories_id =:catId AND t.name = :name", nativeQuery = true)
	SoftwareVersions checkUniqueNessOfChild(@Param("catId") int parentId, @Param("name") String name);
}
