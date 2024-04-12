package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Customers;
//DA0
	@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer>{

	
}
