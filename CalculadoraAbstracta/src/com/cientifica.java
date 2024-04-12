package com;

public class cientifica extends Calculadora {
	
	@Override
	public double opsuma(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	@Override
	public double opresta(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	@Override
	public double opmultiplicacion(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	@Override
	public double opdivicio(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	public double opcos(double a) 
	{
		return Math.cos(a) ;
	}
	public double opsin(double a) {
		return Math.sin(a);
	}
	public double optan(double a) {
		return Math.tan(a);
	}
	public double opExponente(double a) {
		return Math.exp(a);
	}
	

}
