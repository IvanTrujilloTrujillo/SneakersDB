package com.ironhack.sneakers.repository;

import com.ironhack.sneakers.model.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SneakerRepository extends JpaRepository<Sneaker, Integer> {
}
