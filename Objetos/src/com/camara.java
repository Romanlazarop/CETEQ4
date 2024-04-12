package com;

public class camara {
	String valoriso;
	double x;
	int y;
	String zoom;

public camara()
{
	
}

public camara(String valoriso, double x, int y, String zoom) {
	super();
	this.valoriso = valoriso;
	this.x = x;
	this.y = y;
	this.zoom = zoom;
}

public String getValoriso() {
	return valoriso;
}

public void setValoriso(String valoriso) {
	this.valoriso = valoriso;
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public String getZoom() {
	return zoom;
}

public void setZoom(String zoom) {
	this.zoom = zoom;
}

@Override
public String toString() {
	return "camara [valoriso=" + valoriso + ", x=" + x + ", y=" + y + ", zoom=" + zoom + "]";
}

}

