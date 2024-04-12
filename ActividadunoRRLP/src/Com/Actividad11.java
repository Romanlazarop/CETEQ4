package Com;

import java.util.Scanner;

public class Actividad11 
{
	public static void main(String[] args)
	{
		System.out.println("Zona Ubicacion    "+ "\tCosto/Kilogramo");
		System.out.println("1 America Del Norte    "+ "\t24.00 Euros");
		System.out.println("2 America Central    "+ "\t20.00 Euros");
		System.out.println("3 America Del Sur    "+ "\t21.00 Euros");
		System.out.println("4 Europa "+ "\t\t10.00 Euros");
		System.out.println("5 Asia   "+ "\t\t18.00 Euros");
		Scanner v= new Scanner(System.in);
		int zona;
		double kilos;
		System.out.println("Ingresa la Zona: ");
	     zona= v.nextInt();
	     System.out.println("Ingresa Kilogramos: ");
		 kilos= v.nextDouble();
		 if(kilos>=5) 
		 {
			 System.out.println("No Se Puede Transportar"); 
		 }
		 else {
			 
	     switch(zona)
			{
			case 1:
					 System.out.println("Pagara: "+(kilos * 24)+" Euros");
				break;
			case 2:
					 System.out.println("Pagara:"+(kilos * 20)+" Euros");
				break;
			case 3:
					 System.out.println("Pagara:"+(kilos * 21)+" Euros");
				break;
			case 4:
					 System.out.println("Pagara:"+(kilos * 10)+" Euros");
				break;
			case 5:
					 System.out.println("Pagara:"+(kilos * 18)+" Euros");
				break;
			default:
				System.out.println("Valor no aceptable");
			}
		 }
	}
}
