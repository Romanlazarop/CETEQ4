package com;

public class ejercicio7 {
	public static void main(String[] args) 
	{
		double dinero = 700;
		int mes = 1;
		for (;;) {
		dinero = dinero * 1.02;
		if (dinero >= 1500) break;
		mes++;
		}
		System.out.println("meses:"+mes);
		System.out.println("Ganancias"+dinero);
	}

}
