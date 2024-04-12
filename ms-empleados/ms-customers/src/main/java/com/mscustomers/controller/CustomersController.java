package com.mscustomers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mscustomers.impl.CustomersImplement;
import com.persistence.entity.Customers;
import com.persistence.request.CustomersRequest;

@RestController
@RequestMapping("customers")
public class CustomersController {
  
	@Autowired
	CustomersImplement service;
	
	@GetMapping
	public ResponseEntity<List<Customers>>mostrar()
	{
		List<Customers> lista =service.mostrar();
		return new ResponseEntity<List<Customers>>(lista,HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<Customers> guardar(@RequestBody CustomersRequest request)
	{
		Customers cust =service.guardar(request);
		
		return new ResponseEntity<Customers>(cust,HttpStatus.OK);
	}
	@PutMapping
	public ResponseEntity<Customers> actualizar(@RequestBody CustomersRequest request)
	{
		Customers cust=service.actualizar(request);
		return new ResponseEntity<Customers>(cust,HttpStatus.OK);
	}
	@GetMapping("buscar/{id}")
	public ResponseEntity<Customers> buscar(@PathVariable int id)
	{
	  
		Customers cust= service.buscar(id);
		return new ResponseEntity<Customers>(cust,HttpStatus.OK);
	}
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id)
	{
		String s= service.eliminar(id);
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}
}
