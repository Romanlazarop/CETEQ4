package Com;

import java.util.Scanner;

public class Actividad6 {
	public static void main(String[] args)
	{
		Scanner valor= new Scanner(System.in);
		char tipo;
		int tam;
		double precio;
		double precit;
		
		System.out.println("Ingresa Precio de Uva: ");
		precio= valor.nextDouble();
		
		System.out.println("Ingresa Tipo: ");
		tipo= valor.next().charAt(0);
		
		System.out.println("Ingresa tamaño de uva: ");
		tam= valor.nextInt();
		switch(tipo)
		{
		case 'A':
			 if (tam==1)
			 {
				 System.out.println("Precio: " + (precit=precio+.20));
			 }
			 else if(tam==2)
			 {
				 System.out.println("Precio: " + (precit=precio+.30));
			 }
			 
			break;
		case 'B':
			 if (tam==1)
			 {
				 System.out.println("Precio: " + (precit=precio-.30));
			 }
			 else if(tam==2)
			 {
				 System.out.println("Precio: " + (precit=precio-.50));
			 }
			
			
			break;
			
		default:
			 System.out.println("Datos no validos");
		}
		
		
		
		
		
	}

}
