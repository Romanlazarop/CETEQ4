package Com;

import java.util.Scanner;

public class Actividad12 {
	public static void main(String[] args)
	{
		Scanner v= new Scanner(System.in);
		Float peso,altura;
		System.out.println("Ingresa Peso: ");
	     peso= v.nextFloat();
	     System.out.println("Ingresa Altura: ");
		 altura= v.nextFloat();
		 
		 double imc= peso/(altura*altura);
		 System.out.println("IMC: "+ imc);
		 if(imc<16)
		 {
			 System.out.println("Ingrese Al Hospital");
		 }
		 else if(imc>15.99 && imc<17) 
		 {
			 System.out.println("Infrapeso");
		 }
		 else if(imc>16.99 && imc<18) 
		 {
			 System.out.println("Bajo Peso");
		 }
		 else if(imc>17.99 && imc<25) 
		 {
			 System.out.println("Peso Normal");
		 }
		 else if(imc>24.99 && imc<30) 
		 {
			 System.out.println("Sobre Peso Grado I");
		 }
		 else if(imc>29.99 && imc<35) 
		 {
			 System.out.println("Sobre Peso Cronico Grado II");
		 }
		 else if(imc>34.99 && imc<40) 
		 {
			 System.out.println("Obesidad Premorbida Grado III");
		 }
		 else if(imc>40) 
		 {
			 System.out.println("Obesidad Morbida Grado IV");
		 }
	}

}
