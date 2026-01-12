package com.websiteshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.websiteshop.entity.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
	
}
