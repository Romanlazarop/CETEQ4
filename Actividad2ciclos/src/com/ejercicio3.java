package com;

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) 
  {
	  Scanner sn =new Scanner(System.in);
	  char [] palindromo;
	  int izq=0,der;
	  System.out.println("Escribe una frase:");
	  String frase= sn.nextLine().toLowerCase().replace(" ", "");
	  palindromo= frase.toCharArray();
	  der=palindromo.length-1;
	  
	  while(izq < der) 
	  {
		  if(palindromo[izq]==palindromo[der]) 
		  {
			  der--;
			  izq++;
			  
		  }else 
		  {
			  System.out.println("No es un Palindromo");
			  break;
		  } 
	  }
	 if(izq == der) 
	 {
		 System.out.println("La palabra es un Palindromo");
	 }
  }
}
