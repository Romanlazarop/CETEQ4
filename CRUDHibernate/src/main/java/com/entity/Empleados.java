package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "EMPLEADOS")
public class Empleados {
	public Empleados() {
	}

	public Empleados(int id) {
		this.empleadoId = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLEADO_ID", columnDefinition = "NUMBER")
	int empleadoId;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(15)")
	String nombre;
	@Column(name = "FECHA_INGRESO", columnDefinition = "DATE")
	Date fecha;
	@Column(name = "SALARIO", columnDefinition = "NUMBER(5,2)")
	double salario;

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
