package com;

import java.util.ArrayList;
import java.util.List;

public abstract class cajero {
	String direccion ;
	String id;
	List<Cuenta> database =new ArrayList<Cuenta>();
	public cajero()
	{
		
	}
	public cajero(String direccion, String id) {
		super();
		this.direccion = direccion;
		this.id = id;
	}
	
	public cajero(String direccion, String id, List<Cuenta> database) {
		super();
		this.direccion = direccion;
		this.id = id;
		this.database = database;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public List<Cuenta> getDatabase() {
		return database;
	}
	public void setDatabase(List<Cuenta> database) {
		this.database = database;
	}
	
	
	@Override
	public String toString() {
		return "cajero [direccion=" + direccion + ", id=" + id + ", database=" + database + "]";
	}
	//metodo abstracto
	public abstract void cosultaSaldo(String numTarjeta); 
    public abstract Object[] retirar(String numTarjeta,int monto);
}
