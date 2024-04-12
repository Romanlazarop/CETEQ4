package com.general;

import java.util.List;

import com.entity.Productos;

public interface Metodos {
 
	String guardar(Object obj);
	String actualizar(Object prod);
	Object buscar(int id);
	String eliminar(int id);
	List mostrar();
	
}
