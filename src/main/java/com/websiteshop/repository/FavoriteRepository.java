package com.websiteshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.websiteshop.entity.Favorite;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {


}
