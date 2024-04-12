package com.msventas.controller;

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

import com.msventas.impl.VentasImplement;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.request.EmpleadosRequest;
import com.persistence.request.VentasRequest;

@RestController
@RequestMapping("ventas")
public class VentasController {

	 @Autowired
	 VentasImplement service;
	 
	 @GetMapping
	 public ResponseEntity<List<Ventas>> mostrar()
	 {
		 List<Ventas> lista = service.mostrar();
		 return new ResponseEntity<List<Ventas>>(lista,HttpStatus.OK);
	 }
	 @PostMapping
	 public ResponseEntity<Ventas> guardar(@RequestBody VentasRequest request)
		{
			Ventas vent=service.guardar(request);
			if (vent == null)
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(vent);
			
			return new ResponseEntity<Ventas>(vent,HttpStatus.OK);
			
		}
	 @PutMapping
	 public ResponseEntity<Ventas> actualizar(@RequestBody VentasRequest request)
	 {
		 Ventas vent = service.Actualizar(request);
		 if (vent == null)
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(vent);
		 return new ResponseEntity<Ventas>(vent,HttpStatus.OK);
	 }
	 @GetMapping ("buscar/{id}")
	 public ResponseEntity<Ventas> buscar(@PathVariable int id)
	 {
		 Ventas vent=service.buscar(id);
		 return new ResponseEntity<Ventas>(vent,HttpStatus.OK);
		 
	 }
	 @DeleteMapping("eliminar/{id}")
	 public ResponseEntity<String> eliminar(@PathVariable int id)
	 {
		 String m= service.eliminar(id);
		 return new ResponseEntity<String>(m,HttpStatus.OK);
	 }
}
