package com;

public class medico extends profesionista {
String uniforme;
	public medico() {
		
	}
	
	
	public medico(String nombre, int edad, String carrera, String cedula, String uniforme) {
		super(nombre, edad, carrera, cedula);
		this.uniforme = uniforme;
	}


	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Consultas,Recetas,Curaciones,Inyectar");
	
	}
	

}
