package Com;

import java.util.Scanner;

public class Mayor_menor 
{
	public static void main(String[] args)
	{
		Scanner x= new Scanner(System.in);
		Scanner y= new Scanner(System.in);
		
		int numuno;
		int numdos;
		System.out.println("Ingresa El Primer Numero: ");
		numuno=x.nextInt();
		
		System.out.println("Ingresa El Segundo Numero: ");
		numdos=y.nextInt();
		if(numuno>numdos)
		{
			System.out.println("El numero mayor es: " + numuno);
		}
		else 
		{
			System.out.println("El numero mayor es: " + numdos);
		}
		}
	}

