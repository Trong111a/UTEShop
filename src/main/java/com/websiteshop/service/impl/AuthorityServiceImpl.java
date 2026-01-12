
package com.websiteshop.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.websiteshop.entity.Account;
import com.websiteshop.entity.Authority;
import com.websiteshop.repository.AccountRepository;
import com.websiteshop.repository.AuthorityRepository;
import com.websiteshop.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    AuthorityRepository auRepo;

    @Autowired
    AccountRepository aRepo;

    @Override
    public Page<Authority> findAll(Pageable pageable) {
        return auRepo.findAll(pageable);
    }

    @Override
    public List<Authority> findAuthoritiesOfAdministrators() {
        List<Account> accounts = aRepo.getAdministratiors();
        return auRepo.authoritiesOf(accounts);
    }

    @Override
    public Authority create(Authority auth) {
        return auRepo.save(auth);
    }

    @Override
    public List<Authority> findAll() {
        return auRepo.findAll();
    }

    @Override
    public <S extends Authority> S save(S entity) {
        return auRepo.save(entity);
    }

    @Override
    public Optional<Authority> findById(Integer id) {
        return auRepo.findById(id);
    }

    public void deleteById(Integer id) {
        auRepo.deleteById(id);
    }

    public void delete(Authority entity) {
        auRepo.delete(entity);
    }

    public void deleteAll() {
        auRepo.deleteAll();
    }

    @Override
    public void deleteById(Authority id) {
        auRepo.delete(id);
    }

    @Override
    public long countByAccountUsername(String username) {
        return auRepo.countByAccountUsername(username);
    }
    
    @Override
    public Page<Authority> findByAccountUsername(String username, Pageable pageable) {
        return auRepo.findByAccountUsername(username, pageable);
    }

}
