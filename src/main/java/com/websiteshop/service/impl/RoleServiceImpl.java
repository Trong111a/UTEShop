package com.websiteshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.websiteshop.entity.Role;
import com.websiteshop.repository.RoleRepository;
import com.websiteshop.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleRepository rRepo;

	@Override
	public List<Role> findAll() {
		return rRepo.findAll();
	}

}
