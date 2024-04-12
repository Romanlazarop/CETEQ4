package com.msproductos.entity;

import java.io.Serializable;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
public class Productos implements Serializable{
    
	
	private static final long serialVersionUID=1L;
	 @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="PRODUCTO_ID", columnDefinition="NUMBER") 
	 int productoId; 
     @Column(name="DEPTO_ID", columnDefinition="NUMBER") 
     int deptoID;
     @Column(name="NOMBRE", columnDefinition="NVARCHAR2") 
     String nombre;
     @Column(name="FECHA_CAD", columnDefinition="DATE") 
     LocalDate fecha;
     @Column(name="PRECIO_COMPRA", columnDefinition="NUMBER(5,2)") 
     double precioCompra;
     @Column(name="PRECIO_VENTA", columnDefinition="NUMBER(5,2)")
     double precioVenta;
     @Column(name="REFRIGERADO", columnDefinition="CHAR(1)")
     char refrigerado;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
     
     
}
