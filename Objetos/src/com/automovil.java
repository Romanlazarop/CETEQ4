package com;

public class automovil {

	String modelo,diseño;
	double motor,precio;
	int velocidad;
	String consumo;
	
	public automovil()
	{
		
	}
	//
	public automovil(String modelo, String diseño, double motor, double precio, int velocidad, String consumo) {
		super();
		this.modelo = modelo;
		this.diseño = diseño;
		this.motor = motor;
		this.precio = precio;
		this.velocidad = velocidad;
		this.consumo = consumo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDiseño() {
		return diseño;
	}

	public void setDiseño(String diseño) {
		this.diseño = diseño;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	
	 @Override
		public String toString() {
			return "automovil [modelo=" + modelo + ", diseño=" + diseño + ", motor=" + motor + ", precio=" + precio
					+ ", velocidad=" + velocidad + ", consumo=" + consumo + "]";
		}
	 public void automovilM() 
	 {
		 System.out.println("Este es el automovil 2024:");
	 }
}
