
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

import com.websiteshop.entity.Order;
import com.websiteshop.entity.OrderDetail;
import com.websiteshop.repository.OrderDetailRepository;
import com.websiteshop.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Autowired
	OrderDetailRepository dRepo;

	@Override
	public void deleteOrderDetailsByOrderId(Long orderId) {
		 dRepo.deleteOrderDetailsByOrderId(orderId);
	}

	@Override
	public List<OrderDetail> findByStatus(String status, String username) {
		return dRepo.findByStatus(status, username);
	}

	@Override
	public List<OrderDetail> findByStatus(String status) {
		return dRepo.findByStatus(status);
	}

	@Override
	public <S extends OrderDetail> S save(S entity) {
		return dRepo.save(entity);
	}

	@Override
	public <S extends OrderDetail> Optional<S> findOne(Example<S> example) {
		return dRepo.findOne(example);
	}

	@Override
	public List<OrderDetail> findAll() {
		return dRepo.findAll();
	}

	@Override
	public Page<OrderDetail> findAll(Pageable pageable) {
		return dRepo.findAll(pageable);
	}

	@Override
	public List<OrderDetail> findAll(Sort sort) {
		return dRepo.findAll(sort);
	}

	@Override
	public List<OrderDetail> findAllById(Iterable<Long> ids) {
		return dRepo.findAllById(ids);
	}

	@Override
	public <S extends OrderDetail> List<S> saveAll(Iterable<S> entities) {
		return dRepo.saveAll(entities);
	}

	@Override
	public void flush() {
		dRepo.flush();
	}

	@Override
	public <S extends OrderDetail> S saveAndFlush(S entity) {
		return dRepo.saveAndFlush(entity);
	}

	@Override
	public <S extends OrderDetail> List<S> saveAllAndFlush(Iterable<S> entities) {
		return dRepo.saveAllAndFlush(entities);
	}

	@Override
	public <S extends OrderDetail> Page<S> findAll(Example<S> example, Pageable pageable) {
		return dRepo.findAll(example, pageable);
	}

	@Override
	public Optional<OrderDetail> findById(Long id) {
		return dRepo.findById(id);
	}

	@Override
	public void deleteInBatch(Iterable<OrderDetail> entities) {
		dRepo.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Long id) {
		return dRepo.existsById(id);
	}

	@Override
	public <S extends OrderDetail> long count(Example<S> example) {
		return dRepo.count(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<OrderDetail> entities) {
		dRepo.deleteAllInBatch(entities);
	}

	@Override
	public <S extends OrderDetail> boolean exists(Example<S> example) {
		return dRepo.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		dRepo.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends OrderDetail, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return dRepo.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return dRepo.count();
	}

	@Override
	public void deleteAllInBatch() {
		dRepo.deleteAllInBatch();
	}

	@Override
	public OrderDetail getOne(Long id) {
		return dRepo.getOne(id);
	}

	@Override
	public OrderDetail getById(Long id) {
		return dRepo.getById(id);
	}

	@Override
	public OrderDetail getReferenceById(Long id) {
		return dRepo.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		dRepo.deleteAll();
	}

	@Override
	public <S extends OrderDetail> List<S> findAll(Example<S> example) {
		return dRepo.findAll(example);
	}

	@Override
	public <S extends OrderDetail> List<S> findAll(Example<S> example, Sort sort) {
		return dRepo.findAll(example, sort);
	}

	@Override
	public void deleteAll(Iterable<? extends OrderDetail> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		dRepo.deleteById(id);
	}

	@Override
	public void delete(OrderDetail id) {
		// TODO Auto-generated method stub

	}

}