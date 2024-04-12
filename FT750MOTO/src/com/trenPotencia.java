package com;

public class trenPotencia {

	String embrague;
	int cambios;
    String traccion;
    public trenPotencia() 
    {
    	
    }
	public trenPotencia(String embrague, int cambios, String traccion) {
		super();
		this.embrague = embrague;
		this.cambios = cambios;
		this.traccion = traccion;
	}
	public String getEmbrague() {
		return embrague;
	}
	public void setEmbrague(String embrague) {
		this.embrague = embrague;
	}
	public int getCambios() {
		return cambios;
	}
	public void setCambios(int cambios) {
		this.cambios = cambios;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	@Override
	public String toString() {
		return "trenPotencia [embrague=" + embrague + ", cambios=" + cambios + ", traccion=" + traccion + "]";
	}
    
}
