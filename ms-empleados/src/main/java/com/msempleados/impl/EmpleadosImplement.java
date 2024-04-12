package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.service.EmpleadosService;
import com.persistence.entity.Empleados;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.request.EmpleadosRequest;

@Service
public class EmpleadosImplement implements EmpleadosService {
    @Autowired
    EmpleadosRepository repo;
    
    
	@Override
	public Empleados guardar(EmpleadosRequest request) {
		Empleados emple= new Empleados();
		emple.setEmpleadosID(request.getEmpleadosID());
		emple.setNombre(request.getNombre());
		emple.setFecha(request.getFecha());
		emple.setSalario(request.getSalario());
		repo.save(emple);
		return emple;
	}

	@Override
	public Empleados actualizar(EmpleadosRequest request) {
         Empleados emple = repo.findById(request.getEmpleadosID()).get();
         emple.setEmpleadosID(request.getEmpleadosID());
 		 emple.setNombre(request.getNombre());
 		 emple.setFecha(request.getFecha());
 		 emple.setSalario(request.getSalario());
 		 repo.save(emple);
 		 return emple;
	}

	@Override
	public Empleados buscar(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Empleados buscar(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
