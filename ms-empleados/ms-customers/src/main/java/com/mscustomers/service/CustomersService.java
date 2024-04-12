package com.mscustomers.service;

import java.util.List;

import com.persistence.entity.Customers;
import com.persistence.request.CustomersRequest;

public interface CustomersService {
 Customers guardar(CustomersRequest request);
 Customers actualizar(CustomersRequest request);
 Customers buscar(int id);
 String eliminar(int id);
 List mostrar();
 
 Customers buscar(String nombre);
 
}
