package com.vacinaja.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vacinaja.model.*;

@Repository
public interface AdminRepository extends JpaRepository<Admin,String> {
	
}
