package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Ventas;

//DAO
@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer> {
	

}
