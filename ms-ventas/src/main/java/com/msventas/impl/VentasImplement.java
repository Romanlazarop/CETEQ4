package com.msventas.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.msventas.service.VentasService;
import com.persistence.entity.Customers;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.CustomersRepository;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.repository.VentasRepository;
import com.persistence.request.VentasRequest;

@Service
public class VentasImplement implements VentasService {

	@Autowired
	VentasRepository repo;

	@Autowired
	CustomersRepository cusRepo;

	@Autowired
	EmpleadosRepository empleRepo;

	@Override
	public Ventas guardar(VentasRequest request) {

		Optional<Customers> cliente = cusRepo.findById(request.getClienteID());
		Optional<Empleados> empleado = empleRepo.findById(request.getEmpleadoID());
		Ventas vent = null;
		if (!cliente.isPresent()) {
			System.out.println("El cliente no existe");
			return null;
		}
		if (!empleado.isPresent()) {
			System.out.println("El Empleado no existe");
			return null;
		}

		vent = new Ventas();
		Customers customers = cliente.get();
		Empleados empleados = empleado.get();

		vent.setVentasID(request.getVentasID());
		vent.setEmpleado(empleados);
		vent.setCliente(customers);
		vent.setFecha(request.getFecha());
		vent.setSubtotal(request.getSubtotal());
		vent.setTotal(request.getTotal());
		repo.save(vent);
		return vent;
	}

	@Override
	public Ventas Actualizar(VentasRequest request) {

		Optional<Customers> cliente = cusRepo.findById(request.getClienteID());
		Optional<Empleados> empleado = empleRepo.findById(request.getEmpleadoID());
		Optional<Ventas> ventasdb = repo.findById(request.getVentasID());
		Ventas ventaActual = null;

		if (!cliente.isPresent()) 
		{
			System.out.println("El cliente no existe");
			return ventaActual;	
		}
		if(!empleado.isPresent())
		{
			System.out.println("El Empleado no existe");
			return ventaActual;	
		}
		
			if (ventasdb.isPresent()) {

				ventaActual = new Ventas();
				Customers customers = cliente.get();
				Empleados empleados = empleado.get();

				ventaActual.setVentasID(request.getVentasID());
				ventaActual.setEmpleado(empleados);
				ventaActual.setCliente(customers);
				ventaActual.setFecha(request.getFecha());
				ventaActual.setSubtotal(request.getSubtotal());
				ventaActual.setTotal(request.getTotal());
				repo.save(ventaActual);
			}
		         
			return ventaActual;
	}

	@Override
	public Ventas buscar(int id) {
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

}
