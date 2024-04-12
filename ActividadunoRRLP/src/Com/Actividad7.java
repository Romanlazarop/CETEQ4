package Com;

import java.util.Scanner;

public class Actividad7 
{
	public static void main(String[] args)
	{
		Scanner v= new Scanner(System.in);
		int alum;
		System.out.println("Ingresa Numeros De Alumnos: ");
		alum= v.nextInt();
		if(alum>=100)
		{
			System.out.println("Alumnos pagaran 65 Euros ");
		}
		else if(alum>=50 && alum <99 )
		{
			System.out.println("Alumnos pagaran 70 Euros ");
		}
		else if(alum>=30 && alum <49 )
		{
			System.out.println("Alumnos pagaran 95 Euros ");
		}
		else 
		{
			System.out.println("Alumnos pagaran 4000 Euros ");
		}
		
			
		
	}
}
