package Com;

import java.util.Scanner;

public class divicion 
{
	public static void main(String[] args)
	{
		Scanner valor= new Scanner(System.in);
		
		
		double num1;
		double num2;
		double resul;
		System.out.println("Ingresa Numero: ");
		num1=valor.nextInt();
		System.out.println("Ingresa Numero: ");
		num2=valor.nextInt();
		
		resul=num1%num2;
		 if(num2==0)
		{
			System.out.println("Error En el Programa ");
		}
		else
		{
			System.out.println("El resultado es: "+ resul);
		}
	}
	
}
