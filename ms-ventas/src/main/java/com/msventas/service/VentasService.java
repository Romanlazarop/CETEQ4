package com.msventas.service;

import java.util.List;

import com.persistence.entity.Ventas;
import com.persistence.request.VentasRequest;

public interface VentasService {

	Ventas guardar(VentasRequest request);
	Ventas Actualizar(VentasRequest request);
	Ventas buscar(int id);
	String eliminar(int id);
	List mostrar();
	
}
