package Com;

import java.util.Scanner;

public class Actividad9 
{
	public static void main(String[] args)
	{
		Scanner v= new Scanner(System.in);
		int dia;
		System.out.println("Ingresa Dia(Del 1 al 7): ");
	     dia= v.nextInt();
	     
	     switch(dia)
			{
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;	
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Error X.X");
				
			}
	}
}
