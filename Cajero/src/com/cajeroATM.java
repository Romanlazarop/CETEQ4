package com;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class cajeroATM extends cajero {
	Scanner sc = new Scanner(System.in);
	int folio = 0;

	public cajeroATM() {

	}

	public cajeroATM(String direccion, String id, List<Cuenta> database) {
		super(direccion, id, database);
	}

	// forma 1: metodo nativo;
	public void cambioNip() {

		System.out.println("Ingresa el numero de tarjeta:");
		String nt = sc.nextLine();
		String nipnuevo = "";

		// Buscar dentro de la lista
		// for(cuenta cuenta:this.getDatabase()) {
		// si el numero de tarjeta coincide con el que ando buscando
		for (int i = 0; i < this.getDatabase().size(); i++) {
			if (this.getDatabase().get(i).getNumTarjeta().equals(nt)) {
				System.out.println("Ingresa el nuevo NIP:");
				nipnuevo = sc.nextLine();
				this.getDatabase().get(i).setNip(nipnuevo);
				System.out.println("nip cambiado");
				break;
			} else {
				System.out.println("No existe la tarjeta");
			}
		}

	}

	@Override
	public void cosultaSaldo(String numTarjeta) {
		String nip = "";
		Cuenta cuenta = (Cuenta) this.buscarcuenta(numTarjeta)[0];
		if (cuenta != null) {
			System.out.println("Ingresa NIP:");
			nip = sc.nextLine();
			if (cuenta.getNip().equals(nip)) {
				System.out.println("Bienvenido");
				System.out.println("tu saldo es: " + cuenta.getSaldoDisponible());
			}

		} else {
			System.out.println("No existe la tarjeta");
		}
	}

	// forma 2: Metodos heredados y sobre escritos
	@Override
	public Object[] retirar(String numTarjeta, int monto) {
		Cuenta cuenta = null;
		ticket ticket = null;
		Object[] resultado = new Object[2];
		if (this.buscarcuenta(numTarjeta)[0] == null) {
			System.out.println("No es posibleretirar no existe la cuenta");
		} else {// existe la cuenta
			cuenta = (Cuenta) this.buscarcuenta(numTarjeta)[0];
			// validacion
			if (cuenta.getSaldoDisponible() < monto) {
				System.out.println("Saldo insuficiente");
			} else if (cuenta.getSaldoDisponible() - monto < cuenta.getSaldoMin()) {
				System.out.println("Saldo minimo Excedido");
			} else {
				cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
				this.getDatabase().set((Integer) this.buscarcuenta(numTarjeta)[1], cuenta);
				ticket = new ticket(this.getDireccion(), monto, "Retiro", new Date(), this.getId(), folio++);
				resultado[0] = ticket;
				resultado[1] = monto;

			}
		}
		return resultado;
	}

	public Object[] buscarcuenta(String numTarjeta) {
		Object[] data = new Object[2];
		Cuenta cuenta = null;
		int index = 0;

		for (int i = 0; i < this.getDatabase().size(); i++) {
			if (this.getDatabase().get(i).getNumTarjeta().equals(numTarjeta)) {
				cuenta = this.getDatabase().get(i);
				index = i;
				data[0] = cuenta;
				data[1] = index;

				break;
			}
		}
		return data;
	}
}