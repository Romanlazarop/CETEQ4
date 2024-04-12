package com;

public class ejercicio 
{
  public static void main(String[] args)
  {
	  String cifrado="";
	  String letra="";
	  String original="Texto de prueba trece de marzo de 2024";
	  String [] abc={"a","b","c","d","e","f","j","k","l","m","n","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
	  String[] arrayOriginal= original.split("");
	  for(int i=0; i<arrayOriginal.length; i++)
	  {
		  letra=arrayOriginal[i];
		  letra=letra.toLowerCase();
		  if(letra.equals("z"))
		  {
			  cifrado= cifrado + "a";
		  }
		  else if(letra.equals(" "))
		  {
			  cifrado=cifrado + "_";
		  }
		  else {
		 for(int j=0;j<abc.length;j++) 
		 {
			if(abc[j].equals(letra)) 
			{
			cifrado= cifrado +abc[j+1];	
			}
		 }
		  }
	  }
	  System.out.println("Resultado: " + cifrado);
  }
}
