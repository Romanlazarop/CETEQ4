package Com;

import java.util.Scanner;

public class Activivdad14 {
   public static void main(String[] args) 
   {
	   double horas,sueldototal=0;
	   Scanner v= new Scanner(System.in);
	   System.out.println("Ingresa horas: ");
	   horas= v.nextDouble();
	   if(horas<=40) 
	   {
		   sueldototal=horas*16;
		   
	   }
	   else if(horas>=40) 
	   {
		   
		   sueldototal = 40*16+(horas-40)*2*20;
	   }
	   System.out.println("El sueldo es: "+ sueldototal);
   }
}
