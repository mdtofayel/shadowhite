package com.theme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theme.domain.Tags;



@Repository("tagsRepository")
public interface TagsRepository extends JpaRepository<Tags, Integer> {
	Tags findById(Integer id);
}
