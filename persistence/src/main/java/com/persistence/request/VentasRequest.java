package com.persistence.request;

import java.time.LocalDate;

public class VentasRequest {
	int ventasID;
	int empleadoID;
	int clienteID;
	LocalDate fecha;
	double subtotal;
	double total;
	public int getVentasID() {
		return ventasID;
	}
	public void setVentasID(int ventasID) {
		this.ventasID = ventasID;
	}
	public int getEmpleadoID() {
		return empleadoID;
	}
	public void setEmpleadoID(int empleadoID) {
		this.empleadoID = empleadoID;
	}
	public int getClienteID() {
		return clienteID;
	}
	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public VentasRequest(int ventasID, int empleadoID, int clienteID, LocalDate fecha, double subtotal, double total) {
		super();
		this.ventasID = ventasID;
		this.empleadoID = empleadoID;
		this.clienteID = clienteID;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.total = total;
	}
	@Override
	public String toString() {
		return "VentasRequest [ventasID=" + ventasID + ", empleadoID=" + empleadoID + ", clienteID=" + clienteID
				+ ", fecha=" + fecha + ", subtotal=" + subtotal + ", total=" + total + "]";
	}
	
}
