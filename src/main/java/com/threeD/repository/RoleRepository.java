package com.threeD.repository;


import com.threeD.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepositoryThreeD")
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRole(String role);
}