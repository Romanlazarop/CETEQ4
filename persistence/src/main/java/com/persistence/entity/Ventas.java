package com.persistence.entity;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="VENTAS")
public class Ventas implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="VENTA_ID", columnDefinition="NUMBER")
	int ventasID;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="EMPLEADO_ID", columnDefinition="NUMBER") 
    Empleados empleado;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID", columnDefinition="NUMBER")
    Customers cliente;
	
	@Column(name="FECHA_VENTA", columnDefinition="DATE") 
    LocalDate fecha;
	@Column(name="SUBTOTAL", columnDefinition="NUMBER(5,2)") 
    double subtotal;
	@Column(name="TOTAL", columnDefinition="NUMBER(5,2)") 
    double total;
	public int getVentasID() {
		return ventasID;
	}
	public void setVentasID(int ventasID) {
		this.ventasID = ventasID;
	}
	public Empleados getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}
	public Customers getCliente() {
		return cliente;
	}
	public void setCliente(Customers cliente) {
		this.cliente = cliente;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
