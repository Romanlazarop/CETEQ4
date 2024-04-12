package com;

import java.util.Scanner;

public class ejercicio4 {
	
public static void main(String[] args)
{
	Scanner sn= new Scanner(System.in);
	System.out.println("Escribe una Frase: ");
	String frase= sn.nextLine().toLowerCase();
	System.out.println("Escribe una letra: ");
	char letra= sn.next().toLowerCase().charAt(0);
	int Contador = 0;

	for (int i = 0; i < frase.length(); i++) {
		if (frase.charAt(i) == letra) {
			Contador++;
		}
	}

	if (Contador > 0) {
		System.out.println("La letra aparece: " + Contador);
	} else {
		System.out.println("Carácter no encontrado.");
	}
}
}
