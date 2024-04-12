package com.msproductos.request;

import java.time.LocalDate;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


//import jakarta.validation.constraints.

public class ProductosRequest {
	 int productoId;
	 int deptoID;
	 
	 @Size(max = 40, message = "No puede ser mayor a 40 caracteres")
	 @NotBlank(message = "Este atributo no debe quedar vacio ni nulo") //que no vengan vacios ni null
     String nombre; 
	 
	 @FutureOrPresent(message="la fecha no debe de ser del pasado")
     LocalDate fecha;
     
	 @DecimalMax(value ="999")
	 double precioCompra;
	 
	 @DecimalMax(value= "999")
     double precioVenta;
     char refrigerado;
     public ProductosRequest()
     {
    	 
     }
	public ProductosRequest(int productoId, int deptoID, String nombre, LocalDate fecha, double precioCompra,
			double precioVenta, char refrigerado) {
		super();
		this.productoId = productoId;
		this.deptoID = deptoID;
		this.nombre = nombre;
		this.fecha = fecha;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.refrigerado = refrigerado;
	}
	public int getProductoId() {
		return productoId;
	}
	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}
	public int getDeptoID() {
		return deptoID;
	}
	public void setDeptoID(int deptoID) {
		this.deptoID = deptoID;
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
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public char getRefrigerado() {
		return refrigerado;
	}
	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
	}
	@Override
	public String toString() {
		return "ProductosRequest [productoId=" + productoId + ", deptoID=" + deptoID + ", nombre=" + nombre + ", fecha="
				+ fecha + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", refrigerado="
				+ refrigerado + "]";
	}
     
}
