package com;

public class persona {
	String nombre;
	int edad;
	
	public persona() 
	{
		
	}

	public persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
