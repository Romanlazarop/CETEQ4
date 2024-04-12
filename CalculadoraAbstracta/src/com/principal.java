package com;

public class principal 
{
   public static void main(String[] args) 
   {
	   double num1=6,num2=8;
	   basico b= new basico();
	   cientifica c= new cientifica();
	  
	   System.out.println(b.opsuma(num1, num2)+"\n");
	   System.out.println(b.opresta(num1, num2)+"\n");
	   System.out.println(b.opdivicio(num1, num2)+"\n");
	   System.out.println(b.opmultiplicacion(num1, num2)+"\n");
	   
	   System.out.println(c.opsin(num1)+"\n");
	   System.out.println(c.opcos(num1)+"\n");
	   System.out.println(c.optan(num1)+"\n");
	   System.out.println(c.opExponente(num1)+"\n");
	   
   }
		
}
