package com.threeD.repository;

import com.threeD.domain.Badges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("badgesRepositoryThreeD")
public interface BadgesRepository extends JpaRepository<Badges, Integer> {
	
}
