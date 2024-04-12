package com;

public class pantalla {
	double tamaño;
	String panel;
	double ppi;

public pantalla()
{
	
}

public pantalla(double tamaño, String panel, double ppi) {
	super();
	this.tamaño = tamaño;
	this.panel = panel;
	this.ppi = ppi;
}

public double getTamaño() {
	return tamaño;
}

public void setTamaño(double tamaño) {
	this.tamaño = tamaño;
}

public String getPanel() {
	return panel;
}

public void setPanel(String panel) {
	this.panel = panel;
}

public double getPpi() {
	return ppi;
}

public void setPpi(double ppi) {
	this.ppi = ppi;
}

@Override
public String toString() {
	return "pantalla [tamaño=" + tamaño + ", panel=" + panel + ", ppi=" + ppi + "]";
}

}

