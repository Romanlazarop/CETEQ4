package com;

public class consumo {
	double velocidad;
	double consumoCombustible;
	String tipoCombustible;
	public consumo() 
	{
		
	}
	public consumo(double velocidad, double consumoCombustible, String tipoCombustible) {
		super();
		this.velocidad = velocidad;
		this.consumoCombustible = consumoCombustible;
		this.tipoCombustible = tipoCombustible;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public double getConsumoCombustible() {
		return consumoCombustible;
	}
	public void setConsumoCombustible(double consumoCombustible) {
		this.consumoCombustible = consumoCombustible;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	@Override
	public String toString() {
		return "consumo [velocidad=" + velocidad + ", consumoCombustible=" + consumoCombustible + ", tipoCombustible="
				+ tipoCombustible + "]";
	}

}
