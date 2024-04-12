package com.dto;

import java.sql.Date;
import java.util.List;

public class productoDepInvDTO {
String depto;
String producto;
double precioCompra;
char refrigerado;
int stock;
Date fecha;
public String getDepto() {
	return depto;
}
public void setDepto(String depto) {
	this.depto = depto;
}
public String getProducto() {
	return producto;
}
public void setProducto(String producto) {
	this.producto = producto;
}
public double getPrecioCompra() {
	return precioCompra;
}
public void setPrecioCompra(double precioCompra) {
	this.precioCompra = precioCompra;
}
public char getRefrigerado() {
	return refrigerado;
}
public void setRefrigerado(char refrigerado) {
	this.refrigerado = refrigerado;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public productoDepInvDTO(String depto, String producto, double precioCompra, char refrigerado, int stock, Date fecha) {
	super();
	this.depto = depto;
	this.producto = producto;
	this.precioCompra = precioCompra;
	this.refrigerado = refrigerado;
	this.stock = stock;
	this.fecha = fecha;
}
@Override
public String toString() {
	return "productoDepInvDTO [depto=" + depto + ", producto=" + producto + ", precioCompra=" + precioCompra
			+ ", refrigerado=" + refrigerado + ", stock=" + stock + ", fecha=" + fecha + "]";
}
public productoDepInvDTO()
{
	
}
}
