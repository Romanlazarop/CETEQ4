package com;

public class Impresora {
	String tamaño;
	int capacidadhojas;
    String marca;
    String modelo;
    
    public Impresora() 
    {
    	
    }

	public Impresora(String tamaño, int capacidadhojas, String marca, String modelo) {
		super();
		this.tamaño = tamaño;
		this.capacidadhojas = capacidadhojas;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getCapacidadhojas() {
		return capacidadhojas;
	}

	public void setCapacidadhojas(int capacidadhojas) {
		this.capacidadhojas = capacidadhojas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Impresora [tamaño=" + tamaño + ", capacidadhojas=" + capacidadhojas + ", marca=" + marca + ", modelo="
				+ modelo + "]";
	
	}
public void Imprimir(String documento) 
{
	
}
}
