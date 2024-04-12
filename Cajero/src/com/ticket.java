package com;

import java.util.Date;

public class ticket {
	
	String direccion;
	int monto;
	String tipo;
	Date fecha;
	String numCuenta;
	String idCajero;
	int folio;
	public ticket(String direccion, int monto, String tipo, Date fecha, String numCuenta, String idCajero, int folio) {
		super();
		this.direccion = direccion;
		this.monto = monto;
		this.tipo = tipo;
		this.fecha = fecha;
		this.numCuenta = numCuenta;
		this.idCajero = idCajero;
		this.folio = folio;
	}
	public ticket(String direccion, int monto, String tipo, Date fecha, String idCajero, int folio) {
		super();
		this.direccion = direccion;
		this.monto = monto;
		this.tipo = tipo;
		this.fecha = fecha;
		this.idCajero = idCajero;
		this.folio = folio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getIdCajero() {
		return idCajero;
	}
	public void setIdCajero(String idCajero) {
		this.idCajero = idCajero;
	}
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	@Override
	public String toString() {
		return "ticket [direccion=" + direccion + ", monto=" + monto + ", tipo=" + tipo + ", fecha=" + fecha
				+ ", numCuenta=" + numCuenta + ", idCajero=" + idCajero + ", folio=" + folio + "]";
	}
	


}
