package com.msproductos.service;

import java.util.List;

import com.msproductos.entity.Productos;
import com.msproductos.request.ProductosRequest;

public interface ProductosService {

	Productos guardar(ProductosRequest request);
	Productos actualizar(ProductosRequest request);
	Productos buscar(int id);
	String eliminar(int id);
	List mostrar();
	
//------------------------------------------------
	Productos busca(String nombre);
	
}
