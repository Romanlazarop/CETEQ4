package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args)
	{
		int[] xx= new int[5];
		int[] yy= {5,9,34,67,880,1};
		
		Scanner sc=new Scanner(System.in);
		
		//Ciclo for
		for(int i=0; i<xx.length; i++) 
		{
			System.out.println("Ingresa un valor: ");
			xx[i]=sc.nextInt();
		
		}
       //System.out.println("Valor: "+ xx[3]);
		System.out.println(Arrays.toString(xx));
		
//		for(int i=0; i<yy.length; i++) 
//		{
//			System.out.println(yy[i]);
//		
//		}
		System.out.println(Arrays.toString(yy));
	
		//Object[] aa= new Object[10];//multiples valores
		for(int i=yy.length-1;i>=0;i--)
		{
			System.out.println(yy[i]);
		}
	}

}
