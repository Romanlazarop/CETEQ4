package com.persistence.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class Customers implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="CLIENTE_ID", columnDefinition="NUMBER") 
	 int clienteID; 
    @Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)") 
    String nombre;
    @Column(name="FECHA_NAC", columnDefinition="DATE") 
    LocalDate fecha;
    @Column(name="DOMICILIO", columnDefinition="NVARCHAR2(40)") 
    String domicilio;
    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference
    private List<Ventas> listaventa;
    
	public List<Ventas> getListaventa() {
		return listaventa;
	}
	public void setListaventa(List<Ventas> listaventa) {
		this.listaventa = listaventa;
	}
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	
}
