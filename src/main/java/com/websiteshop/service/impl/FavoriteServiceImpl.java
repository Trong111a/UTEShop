package com.websiteshop.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websiteshop.entity.Favorite;
import com.websiteshop.repository.FavoriteRepository;
import com.websiteshop.service.FavoriteService;

@Service
public class FavoriteServiceImpl implements FavoriteService {
	@Autowired
	FavoriteRepository fRepo;

	@Override
	public List<Favorite> findAll() {
		return fRepo.findAll();
	}

	@Override
	public Optional<Favorite> findById(Long id) {
		return fRepo.findById(id);
	}

	@Override
	public void delete(Favorite entity) {
		fRepo.delete(entity);
	}

	@Override
	public <S extends Favorite> S save(S entity) {
		return fRepo.save(entity);
	}
	
}
