package com;

public interface Funciones {
	ticket depositar(String numTarjeta, int monto);
	void recargarSaldo(String compañia, String numero,int monto);
	int retiroSinTarjeta(String folio);
	
}
