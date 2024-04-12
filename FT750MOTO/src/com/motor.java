package com;

public class motor {
	String tipo;
	String diametro;
	double capacidad;
	double potencia;
	String carburador;
	
	public motor()
	{
		
	}

	public motor(String tipo, String diametro, double capacidad, double potencia, String carburador) {
		super();
		this.tipo = tipo;
		this.diametro = diametro;
		this.capacidad = capacidad;
		this.potencia = potencia;
		this.carburador = carburador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDiametro() {
		return diametro;
	}

	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getCarburador() {
		return carburador;
	}

	public void setCarburador(String carburador) {
		this.carburador = carburador;
	}

	@Override
	public String toString() {
		return "motor [tipo=" + tipo + ", diametro=" + diametro + ", capacidad=" + capacidad + ", potencia=" + potencia
				+ ", carburador=" + carburador + "]";
	}

}
