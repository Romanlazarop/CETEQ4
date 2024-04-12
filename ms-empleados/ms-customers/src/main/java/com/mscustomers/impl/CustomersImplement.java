package com.mscustomers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscustomers.service.CustomersService;
import com.persistence.entity.Customers;
import com.persistence.repository.CustomersRepository;
import com.persistence.request.CustomersRequest;

@Service
public class CustomersImplement implements CustomersService {

	 @Autowired
	 CustomersRepository repo;
	 
	 
	 
	@Override
	public Customers guardar(CustomersRequest request) {
		Customers cust= new Customers();
		cust.setClienteID(request.getClienteID());
		cust.setNombre(request.getNombre());
		cust.setFecha(request.getFecha());
		cust.setDomicilio(request.getDomicilio());
		repo.save(cust);
		return cust;
	}

	@Override
	public Customers actualizar(CustomersRequest request) {
		Customers cust= repo.findById(request.getClienteID()).get();
		cust.setClienteID(request.getClienteID());
		cust.setNombre(request.getNombre());
		cust.setFecha(request.getFecha());
		cust.setDomicilio(request.getDomicilio());
		repo.save(cust);
		return cust;
	}

	@Override
	public Customers buscar(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminar";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customers buscar(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
   
	
	

}
