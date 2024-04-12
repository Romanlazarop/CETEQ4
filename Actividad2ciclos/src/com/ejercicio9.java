package com;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args)
	
	{
	  Scanner sn= new Scanner(System.in);
	  int num1,num2;
	  do {
      	System.out.println("Ingresa un numero: ");
  		num1= sn.nextInt();
  		System.out.println("Ingresa un numero: ");
  		num2= sn.nextInt();
          if(num1 >= num2){
              System.out.println("Debes introducir dos números distintos");
          }
	  }
       while(num1>=num2); 
	  System.out.println("\nNúmeros pares desde " + num1 + " hasta " + num2 + " : ");
      for (int i = num1; i <= num2; i++) {
          if (i % 2 == 0) {
              System.out.println(i);
          }
      }
	}

}
