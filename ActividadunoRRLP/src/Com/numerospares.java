package Com;

import java.util.Scanner;

public class numerospares {
	public static void main(String[] args)
	{
		Scanner a= new Scanner(System.in);
		int num;
		System.out.println("Ingresa Numero: ");
		num=a.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Numero Par");
		}
		else
		{
			System.out.println("Numero Impar");
		}
	}
}
