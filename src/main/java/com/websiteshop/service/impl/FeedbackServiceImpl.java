package com.websiteshop.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.websiteshop.entity.Account;
import com.websiteshop.entity.Feedback;
import com.websiteshop.repository.FeedbackRepository;
import com.websiteshop.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	FeedbackRepository fRepo;

	@Autowired
	FeedbackService feedbackService;

	@Override
	public Page<Feedback> findAll(Pageable pageable) {
		return fRepo.findAll(pageable);
	}

	@Override
	public List<Feedback> findAll() {
		return fRepo.findAll();
	}

	@Override
	public Optional<Feedback> findById(Long id) {
		return fRepo.findById(id);
	}

	@Override
	public void delete(Feedback entity) {
		fRepo.delete(entity);
	}

	@Override
	public <S extends Feedback> S save(S entity) {
		return fRepo.save(entity);
	}

	// public Page<Feedback> findByUsernameContaining(Account account, Pageable
	// pageable) {
	// String username = account.getUsername();
	// return fRepo.findByUsernameContaining(username, pageable);
	// }
	
	@Override
    public Page<Feedback> findByAccountUsername(String username, Pageable pageable) {
        return fRepo.findByAccountUsername(username, pageable);
    }

    @Override
    public long countByAccountUsername(String username) {
        return fRepo.countByAccountUsername(username);
    }
}
