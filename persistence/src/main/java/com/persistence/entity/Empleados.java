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
@Table(name="EMPLEADOS")
public class Empleados implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="EMPLEADO_ID", columnDefinition="NUMBER") 
	 int empleadosID; 
    @Column(name="NOMBRE", columnDefinition="NVARCHAR2") 
    String nombre;
    @Column(name="FECHA_INGRESO", columnDefinition="DATE") 
    LocalDate fecha;
    @Column(name="SALARIO", columnDefinition="NUMBER(5,2)") 
    double salario;
    
    @OneToMany(mappedBy = "empleado")
    @JsonManagedReference
    private List<Ventas> listaventa;

	public List<Ventas> getListaventa() {
		return listaventa;
	}

	public void setListaventa(List<Ventas> listaventa) {
		this.listaventa = listaventa;
	}

	public int getEmpleadosID() {
		return empleadosID;
	}

	public void setEmpleadosID(int empleadosID) {
		this.empleadosID = empleadosID;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	
    
}
