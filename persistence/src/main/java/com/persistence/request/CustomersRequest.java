package com.persistence.request;

import java.time.LocalDate;

public class CustomersRequest {
	int clienteID; 
	String nombre;
	 LocalDate fecha;
	 String domicilio;
	public int getClienteID() {
		return clienteID;
	}
	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public CustomersRequest(int clienteID, String nombre, LocalDate fecha, String domicilio) {
		super();
		this.clienteID = clienteID;
		this.nombre = nombre;
		this.fecha = fecha;
		this.domicilio = domicilio;
	}
	@Override
	public String toString() {
		return "CustomersRequest [clienteID=" + clienteID + ", nombre=" + nombre + ", fecha=" + fecha + ", domicilio="
				+ domicilio + "]";
	}
	 
}
