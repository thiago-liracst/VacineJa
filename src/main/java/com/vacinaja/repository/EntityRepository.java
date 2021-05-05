package com.vacinaja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vacinaja.model.Entitys;

@Repository
public interface EntityRepository extends JpaRepository<Entitys, Long>{

}
