package com.websiteshop.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.websiteshop.entity.Product;
import com.websiteshop.repository.ProductRepository;
import com.websiteshop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository pRepo;

    @Override
    public List<Product> findByCategoryId(Long cid) {
        return pRepo.findByCategoryId(cid);
    }

    @Override
    public <S extends Product> S save(S entity) {
        return pRepo.save(entity);
    }

    @Override
    public List<Product> findAll() {
        return pRepo.findAll();
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return pRepo.findAll(pageable);
    }

    @Override
    public List<Product> findAll(Sort sort) {
        return pRepo.findAll(sort);
    }

    @Override
    public List<Product> findAllById(Iterable<Long> ids) {
        return pRepo.findAllById(ids);
    }

    @Override
    public <S extends Product> List<S> saveAll(Iterable<S> entities) {
        return pRepo.saveAll(entities);
    }

    @Override
    public void flush() {
        pRepo.flush();
    }

    @Override
    public <S extends Product> S saveAndFlush(S entity) {
        return pRepo.saveAndFlush(entity);
    }

    @Override
    public <S extends Product> List<S> saveAllAndFlush(Iterable<S> entities) {
        return pRepo.saveAllAndFlush(entities);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return pRepo.findById(id);
    }

    @Override
    public void deleteInBatch(Iterable<Product> entities) {
        pRepo.deleteInBatch(entities);
    }

    @Override
    public boolean existsById(Long id) {
        return pRepo.existsById(id);
    }

    @Override
    public void deleteAllInBatch(Iterable<Product> entities) {
        pRepo.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
        pRepo.deleteAllByIdInBatch(ids);
    }

    @Override
    public long count() {
        return pRepo.count();
    }

    @Override
    public void deleteAllInBatch() {
        pRepo.deleteAllInBatch();
    }

    @Override
    public void deleteById(Long id) {
        pRepo.deleteById(id);
    }

    @Override
    public Product getOne(Long id) {
        return pRepo.getOne(id);
    }

    @Override
    public void delete(Product entity) {
        pRepo.delete(entity);
    }

    @Override
    public Product getById(Long id) {
        return pRepo.getById(id);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        pRepo.deleteAllById(ids);
    }

    @Override
    public void deleteAll(Iterable<? extends Product> entities) {
        pRepo.deleteAll(entities);
    }

    @Override
    public Product getReferenceById(Long id) {
        return pRepo.getReferenceById(id);
    }

    @Override
    public void deleteAll() {
        pRepo.deleteAll();
    }

    @Override
    public List<Product> findByNameContaining(String name) {
        return pRepo.findByNameContaining(name);
    }

    @Override
    public Page<Product> findByNameContaining(String name, Pageable pageable) {
        return pRepo.findByNameContaining(name, pageable);
    }

    @Override
    public long countByNameContaining(String name) {
        return pRepo.countByNameContaining(name);
    }

}
