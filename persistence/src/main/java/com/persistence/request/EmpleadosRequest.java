package com.persistence.request;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class EmpleadosRequest {
	int empleadosID; 
    String nombre;
    LocalDate fecha;
    double salario;
    
    public EmpleadosRequest()
    {
    	
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

	public EmpleadosRequest(int empleadosID, String nombre, LocalDate fecha, double salario) {
		super();
		this.empleadosID = empleadosID;
		this.nombre = nombre;
		this.fecha = fecha;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "EmpleadosRequest [empleadosID=" + empleadosID + ", nombre=" + nombre + ", fecha=" + fecha + ", salario="
				+ salario + "]";
	}
    

}
