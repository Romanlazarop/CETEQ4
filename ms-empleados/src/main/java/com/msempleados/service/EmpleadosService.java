package com.msempleados.service;

import java.util.List;

import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadosRequest;

public interface EmpleadosService {

	Empleados guardar(EmpleadosRequest request);
	Empleados actualizar(EmpleadosRequest request);
	Empleados buscar(int id);
	String eliminar(int id);
	List mostrar();
	
	Empleados buscar(String nombre);
	
}
