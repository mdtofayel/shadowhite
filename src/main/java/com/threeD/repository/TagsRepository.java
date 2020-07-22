package com.threeD.repository;

import com.threeD.domain.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("tagsRepositoryThreeD")
public interface TagsRepository extends JpaRepository<Tags, Integer> {
	Tags findById(Integer id);
}
