package com;

import java.util.Scanner;

public class practicaja extends cajero implements Funciones {

	
	public void cambioNip() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingresa tu numero de tarjeta: ");
		System.out.println("Ingresa tu nuevo nip");
		System.out.println("nip cambiado");
		
	}

	@Override
	public void cosultaSaldo(String numTarjeta) {
		// TODO Auto-generated method stub
		
	}
    //
	@Override
	public Object[] retirar(String numTarjeta,int monto) {
		// TODO Auto-generated method stub
		return null;
	}
// forma 3: metodos traido de la interface
	@Override
	public ticket depositar(String numTarjeta, int monto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void recargarSaldo(String compañia, String numero, int monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int retiroSinTarjeta(String folio) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
