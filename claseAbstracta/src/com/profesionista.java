package com;

public abstract class profesionista extends persona{
   
	String carrera;
	String cedula;
	
	public profesionista() {}

	public profesionista(String carrera, String cedula) {
		super();
		this.carrera = carrera;
		this.cedula = cedula;
	}

	public profesionista(String nombre, int edad, String carrera, String cedula) {
		super(nombre, edad);
		this.carrera = carrera;
		this.cedula = cedula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "profesionista [carrera=" + carrera + ", cedula=" + cedula + "]";
	}
	//metodo nativo y exclusivo de la clase hija
	public void estudiar() 
	{
		
	}
	//metodo Abstracto
	public abstract void trabajar();
}
