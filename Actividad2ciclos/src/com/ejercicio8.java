package com;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1,num2,menor,mayor;
	       
	        
	        do {
	        	System.out.println("Ingresa un numero: ");
	    		num1= sn.nextInt();
	    		System.out.println("Ingresa un numero: ");
	    		num2= sn.nextInt();
	            if(num1 == num2){
	                System.out.println("Debes introducir dos números distintos");
	            }
	        } while (num1 == num2);
	       
	            if (num1 > num2) {
	                mayor = num1;
	                menor = num2;
	        } else {
	                mayor = num2;
	                menor = num1;
	        }
	        System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");
	        for (int i = menor; i <= mayor; i++) {
	            System.out.println(i);
	        }
		
}
}
