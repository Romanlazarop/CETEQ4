package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Empleados;

//DAO
@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {

}
