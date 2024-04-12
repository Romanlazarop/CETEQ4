package Com;

import java.util.Scanner;

public class Actividad8 
{
	public static void main(String[] args)
	{
		Scanner v= new Scanner(System.in);
		int dado;
		System.out.println("Ingresa Valor: ");
	     dado= v.nextInt();
	     
	     switch(dado)
			{
			case 1:
				System.out.println("SEIS");
				break;
			case 2:
				System.out.println("CINCO");
				break;	
			case 3:
				System.out.println("CUATRO");
				break;
			case 4:
				System.out.println("TRES");
				break;
			case 5:
				System.out.println("DOS");
				break;
			case 6:
				System.out.println("UNO");
				break;
			default:
				System.out.println("Error: numero incorrecto");
				
			}
		}
}
