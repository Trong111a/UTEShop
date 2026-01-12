package com.websiteshop.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.websiteshop.entity.Category;
import com.websiteshop.repository.CategoryRepository;
import com.websiteshop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepository cRepo;

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return cRepo.findAll(pageable);
	}

	@Override
	public Page<Category> findByNameContaining(String name, Pageable pageable) {
		return cRepo.findByNameContaining(name, pageable);
	}

	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.cRepo = categoryRepository;
	}

	@Override
	public <S extends Category> S save(S entity) {
		return cRepo.save(entity);
	}

	@Override
	public List<Category> findAll() {
		return cRepo.findAll();
	}

	@Override
	public List<Category> findAllById(Iterable<Long> ids) {
		return cRepo.findAllById(ids);
	}

	@Override
	public <S extends Category> List<S> saveAll(Iterable<S> entities) {
		return cRepo.saveAll(entities);
	}

	@Override
	public void flush() {
		cRepo.flush();
	}

	@Override
	public <S extends Category> S saveAndFlush(S entity) {
		return cRepo.saveAndFlush(entity);
	}

	@Override
	public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
		return cRepo.saveAllAndFlush(entities);
	}

	@Override
	public Optional<Category> findById(Long id) {
		return cRepo.findById(id);
	}

	@Override
	public void deleteInBatch(Iterable<Category> entities) {
		cRepo.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Long id) {
		return cRepo.existsById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<Category> entities) {
		cRepo.deleteAllInBatch(entities);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		cRepo.deleteAllByIdInBatch(ids);
	}

	@Override
	public long count() {
		return cRepo.count();
	}

	@Override
	public void deleteAllInBatch() {
		cRepo.deleteAllInBatch();
	}

	@Override
	public void deleteById(Long id) {
		cRepo.deleteById(id);
	}

	@Override
	public Category getOne(Long id) {
		return cRepo.getOne(id);
	}

	@Override
	public void delete(Category entity) {
		cRepo.delete(entity);
	}

	@Override
	public Category getById(Long id) {
		return cRepo.getById(id);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		cRepo.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Category> entities) {
		cRepo.deleteAll(entities);
	}

	@Override
	public Category getReferenceById(Long id) {
		return cRepo.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		cRepo.deleteAll();
	}

	@Override
	public long countByNameContaining(String name) {
		return cRepo.countByNameContaining(name);
	}

}
