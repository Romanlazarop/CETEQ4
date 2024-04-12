package Com;

import java.util.Scanner;

public class Mayuscula 
{
	public static void main(String[] args)
	{
		int valor=0;
		String dic="QWERTYUIOPASDFGHJKLÑZXCVBNM";
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa una Frase: ");
		String nom = sc.nextLine();
		System.out.println("Nombre: "+ nom);
		
		int longitud= nom.length();
		char[] arraynombre= new char[longitud];
		
		for(int i=0;i<arraynombre.length;i++)
		{
			arraynombre[i]=nom.charAt(i);
		}
		for(int i=0;i<arraynombre.length;i++)
		{
			
			int pos = dic.indexOf(arraynombre[i]);
			if(pos!=-1) 
			{
				valor++;
			}
			
			
		}
		System.out.println("Mayusculas: "+ valor);
		
			
		
	}
	
}
