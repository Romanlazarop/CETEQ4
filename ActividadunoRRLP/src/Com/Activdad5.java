package Com;

import java.util.Scanner;

public class Activdad5 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int edad;
		int nota;
		char sexo;
		
		System.out.println("Ingresa Edad: ");
		edad=sc.nextInt();
		System.out.println("Ingresa Nota: ");
		nota=sc.nextInt();
		System.out.println("Ingresa sexo: ");
		sexo=sc.next().charAt(0);
		
		if(edad>=18 && nota>=5){
			if(sexo=='M') 
			{
				System.out.println("Posible");
			}
			
		else if(sexo =='F'){		
				System.out.println("Aceptable");
		}
		else {
			System.out.println("No Aceptable");
		}
		
		}
	}
}

