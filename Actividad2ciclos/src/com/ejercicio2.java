package com;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) 
	{
		int total;
		Scanner v= new Scanner(System.in);
		System.out.println("Ingresa numero de tabla: ");
		int valor= v.nextInt();
		System.out.println("Hasta el numero: ");
		int multiple=v.nextInt();
		for(int i=multiple ;i<=multiple;i++) 
		{ 
			
			for(int j=1;j<=i;j++) {
			System.out.println(valor+"x"+j+"="+(total=valor*j));
			}
		}
	}

}
