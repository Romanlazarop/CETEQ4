package com;

public class Cuenta {
	String numcuenta;
	String numTarjeta;
	double saldoDisponible;
	double saldoMin;
	double saldoMax;
	String tipo;
	String nip;
	public Cuenta()
	{
		
	}
	public String getNumcuenta() {
		return numcuenta;
	}
	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}
	public String getNumTarjeta() {
		return numTarjeta;
	}
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	public double getSaldoDisponible() {
		return saldoDisponible;
	}
	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
	public double getSaldoMin() {
		return saldoMin;
	}
	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}
	public double getSaldoMax() {
		return saldoMax;
	}
	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public Cuenta(String numcuenta, String numTarjeta, double saldoDisponible, double saldoMin, double saldoMax,
			String tipo, String nip) {
		super();
		this.numcuenta = numcuenta;
		this.numTarjeta = numTarjeta;
		this.saldoDisponible = saldoDisponible;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.tipo = tipo;
		this.nip = nip;
	}
	@Override
	public String toString() {
		return "cuenta [numcuenta=" + numcuenta + ", numTarjeta=" + numTarjeta + ", saldoDisponible=" + saldoDisponible
				+ ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax + ", tipo=" + tipo + ", nip=" + nip + "]";
	}
	
	

}
