package com;

public class sistemaElectronico {
	String alternador;
	int bateria;
	public sistemaElectronico() 
	{
		
	}
	public sistemaElectronico(String alternador, int bateria) {
		super();
		this.alternador = alternador;
		this.bateria = bateria;
	}
	public String getAlternador() {
		return alternador;
	}
	public void setAlternador(String alternador) {
		this.alternador = alternador;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	@Override
	public String toString() {
		return "sistemaElectronico [alternador=" + alternador + ", bateria=" + bateria + "]";
	}

}
