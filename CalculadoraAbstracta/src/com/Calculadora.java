package com;

public abstract class Calculadora {
 String botones;
 String color;
 String pantalla;
 
 public Calculadora() {
	 
 }
 
 public Calculadora(String botones, String color, String pantalla) {
	super();
	this.botones = botones;
	this.color = color;
	this.pantalla = pantalla;
}


@Override
public String toString() {
	return "Calculadora [botones=" + botones + ", color=" + color + ", pantalla=" + pantalla + "]";
}

public String getBotones() {
	return botones;
}

public void setBotones(String botones) {
	this.botones = botones;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getPantalla() {
	return pantalla;
}

public void setPantalla(String pantalla) {
	this.pantalla = pantalla;
}

public abstract double opsuma(double a, double b);
public abstract double opresta(double a, double b);
public abstract double opmultiplicacion(double a, double b);
public abstract double opdivicio(double a, double b);

 
}
