package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Activdad1tex 
{
	public static void main(String[] args) 
	 {
		String ruta="C:\\Users\\ThinkPad\\Desktop\\prueba.txt";
		 String ruta2="C:\\Users\\ThinkPad\\Desktop\\prueba 2.txt";
		 
		
		 File file= new File(ruta);
		 File file1= new File(ruta2);
		 try 
		 {
			 
			 String linea;
		 FileReader fr= new FileReader(file);
		 BufferedReader br= new BufferedReader(fr);
		 FileWriter fw =new FileWriter(file1);
		
		 while((linea= br.readLine())!=null) {
			 int valor = 0;
			   for(int i=0; i<linea.length();i++) {
				   if(linea.charAt(i)!='\n') {
				   valor ++;
				   }
			   }
			   System.out.println(linea);
				 fw.write(valor+"\n");
				 
			   }
		 fw.close();
		 
		 }
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
}
