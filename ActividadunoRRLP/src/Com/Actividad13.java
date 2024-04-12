package Com;

import java.util.Scanner;

public class Actividad13 {
	public static void main(String[] args) 
	{
		double donacion;
	  Scanner v= new Scanner(System.in);
		System.out.println("Ingresa $ de la donacion: ");
	     donacion= v.nextDouble();
	     
	     if(donacion>=10000) 
	     {
	    	 System.out.println("Centro de salud: "+ (donacion*0.30));
	    	 System.out.println("Comedor: "+ (donacion*0.50));
	    	 System.out.println("Valores: "+ (donacion*0.20));
	     }
	     else
	     {
	    	 System.out.println("Se le destina al centro de salud: "+ (donacion*0.25));
	    	 System.out.println("Al comedor: "+ (donacion*0.60));
	    	 System.out.println("Y a la bolsa de valores "+ (donacion*0.15)); 
	     }
	     
	}

	

}
