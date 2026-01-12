
package com.websiteshop.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.websiteshop.entity.Order;
import com.websiteshop.entity.OrderDetail;
import com.websiteshop.repository.OrderRepository;
import com.websiteshop.repository.OrderDetailRepository;
import com.websiteshop.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository oRepo;

	@Autowired
	OrderDetailRepository odRepo;

	@Override
	public Order updateStatus(String status, Long orderId) {
		return oRepo.updateStatus(status, orderId);
	}

	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();

		Order order = mapper.convertValue(orderData, Order.class);
		oRepo.save(order);

		TypeReference<List<OrderDetail>> type = new TypeReference<List<OrderDetail>>() {
		};
		List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"), type).stream()
				.peek(d -> d.setOrder(order)).collect(Collectors.toList());
		odRepo.saveAll(details);

		return order;
	}

	@Override
	public void deleteOrderByUsername(String username) {
		oRepo.deleteOrderByUsername(username);
	}

	@Override
	public List<Order> findByNameContaining(String name) {
		return oRepo.findByNameContaining(name);
	}

	@Override
	public Page<Order> findByNameContaining(String name, Pageable pageable) {
		return oRepo.findByNameContaining(name, pageable);
	}

	@Override
	public Order findById(Long id) {
		return oRepo.findById(id).get();
	}

	@Override
	public Page<Order> findByUsername(String username, Pageable pageable) {
		return oRepo.findByUsername(username, pageable);
	}

	@Override
	public <S extends Order> S save(S entity) {
		return oRepo.save(entity);
	}

	@Override
	public <S extends Order> Optional<S> findOne(Example<S> example) {
		return oRepo.findOne(example);
	}

	@Override
	public List<Order> findAll() {
		return oRepo.findAll();
	}

	@Override
	public Page<Order> findAll(Pageable pageable) {
		return oRepo.findAll(pageable);
	}

	@Override
	public List<Order> findAll(Sort sort) {
		return oRepo.findAll(sort);
	}

	@Override
	public List<Order> findAllById(Iterable<Long> ids) {
		return oRepo.findAllById(ids);
	}

	@Override
	public <S extends Order> List<S> saveAll(Iterable<S> entities) {
		return oRepo.saveAll(entities);
	}

	@Override
	public void flush() {
		oRepo.flush();
	}

	@Override
	public <S extends Order> S saveAndFlush(S entity) {
		return oRepo.saveAndFlush(entity);
	}

	@Override
	public <S extends Order> List<S> saveAllAndFlush(Iterable<S> entities) {
		return oRepo.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable) {
		return oRepo.findAll(example, pageable);
	}

	@Override
	public Optional<Order> findByIdd(Long id) {
		return oRepo.findById(id);
	}

	@Override
	public void deleteInBatch(Iterable<Order> entities) {
		oRepo.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Long id) {
		return oRepo.existsById(id);
	}

	@Override
	public <S extends Order> long count(Example<S> example) {
		return oRepo.count(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<Order> entities) {
		oRepo.deleteAllInBatch(entities);
	}

	@Override
	public <S extends Order> boolean exists(Example<S> example) {
		return oRepo.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		oRepo.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends Order, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return oRepo.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return oRepo.count();
	}

	@Override
	public void deleteAllInBatch() {
		oRepo.deleteAllInBatch();
	}

	@Override
	public void deleteById(Long id) {
		oRepo.deleteById(id);
	}

	@Override
	public Order getOne(Long id) {
		return oRepo.getOne(id);
	}

	@Override
	public void delete(Order entity) {
		oRepo.delete(entity);
	}

	@Override
	public Order getById(Long id) {
		return oRepo.getById(id);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		oRepo.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Order> entities) {
		oRepo.deleteAll(entities);
	}

	@Override
	public Order getReferenceById(Long id) {
		return oRepo.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		oRepo.deleteAll();
	}

	@Override
	public <S extends Order> List<S> findAll(Example<S> example) {
		return oRepo.findAll(example);
	}

	@Override
	public <S extends Order> List<S> findAll(Example<S> example, Sort sort) {
		return oRepo.findAll(example, sort);
	}

	public long countByNameContaining(String name) {
		return oRepo.countByNameContaining(name);
	}

	@Override
	public long countByUsername(String username) {
		return oRepo.countByUsername(username);
	}

	@Override
	public long countByUsernameAndStatus(String username, String status) {
		return oRepo.countByUsernameAndStatus(username, status);
	}

}