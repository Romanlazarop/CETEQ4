package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Productos;
import com.msproductos.exception.BusinessException;
import com.msproductos.repository.ProductoRepository;
import com.msproductos.request.ProductosRequest;
import com.msproductos.service.ProductosService;

@Service
public class ProductoImplement implements ProductosService{

	//Inyeccion de dependencias 
	@Autowired
	ProductoRepository repo;
	
	@Override
	public Productos guardar(ProductosRequest request) {
		//que no se repita un producto
		//que refrigerado sea Y o N
        Optional<Productos> prodb =repo.findByNombre(request.getNombre());
        Productos prod=null;
		if(prodb.isPresent()) 
		{
			throw new BusinessException("Este producto ya existe");
		}else if(!(request.getRefrigerado()=='Y' || request.getRefrigerado()=='N')) {
			throw new BusinessException("El atributo refrigerado debe ser Y o N");
		}
		else {
		prod =new Productos();
		prod.setDeptoID(request.getDeptoID());
		prod.setFecha(request.getFecha());
		prod.setNombre(request.getNombre());
		prod.setPrecioCompra(request.getPrecioCompra());
		prod.setPrecioVenta(request.getPrecioVenta());
		prod.setRefrigerado(request.getRefrigerado());
		repo.save(prod);
		}
		return prod;
	}

	@Override
	public Productos actualizar(ProductosRequest request) {
		Productos prod =repo.findById(request.getProductoId()).get();
		prod.setDeptoID(request.getDeptoID());
		prod.setFecha(request.getFecha());
		prod.setNombre(request.getNombre());
		prod.setPrecioCompra(request.getPrecioCompra());
		prod.setPrecioVenta(request.getPrecioVenta());
		prod.setRefrigerado(request.getRefrigerado());
		repo.save(prod);
		return prod;
	}

	@Override
	public Productos buscar(int id) {
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
	public Productos busca(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
