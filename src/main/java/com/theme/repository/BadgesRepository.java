package com.theme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theme.domain.Badges;



@Repository("badgesRepository")
public interface BadgesRepository extends JpaRepository<Badges, Integer> {
	
}
