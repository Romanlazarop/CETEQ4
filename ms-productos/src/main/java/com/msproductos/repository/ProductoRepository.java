package com.msproductos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Productos;
import java.util.List;



//DAO
@Repository
public interface ProductoRepository extends JpaRepository<Productos,Integer>  {
 //metodo que busque por nombre 
	@Query("SELECT p FROM Productos p WHERE p.nombre=:nombre")//JPQL
	Optional<Productos> findByNombre(@Param("nombre") String nombre);
	
}
