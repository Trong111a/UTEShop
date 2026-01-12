package com.websiteshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websiteshop.entity.Statitics;
import com.websiteshop.model.StatisticalForMonthProjections;
import com.websiteshop.model.StatisticalForProductProjections;
import com.websiteshop.model.StatisticalForYearProjections;
import com.websiteshop.repository.StatiticRepository;
import com.websiteshop.service.StatisticalService;

@Service
public class StatisticalServiceImpl implements StatisticalService {

	@Autowired
	StatiticRepository sRepo;

	@Override
	public Statitics SLOrder() {
		return sRepo.SLOrder();
	}

	@Override
	public List<StatisticalForMonthProjections> statisticalForMonth() {
		return sRepo.statisticalForMonth();
	}

	@Override
	public List<StatisticalForYearProjections> statisticalForYear() {
		return sRepo.statisticalForYear();
	}

	@Override
	public List<StatisticalForProductProjections> statisticalForProduct() {
		return sRepo.statisticalForProduct();
	}	
}
