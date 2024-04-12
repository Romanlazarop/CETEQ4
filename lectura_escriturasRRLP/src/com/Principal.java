package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
 public static void main(String[] args) 
 {
	// String ruta="C:\\Users\\ThinkPad\\Desktop\\Prueba.txt";
	 String ruta2="C:\\Users\\ThinkPad\\Desktop\\Prueba.txt";
	 String linea="";
	 File file= new File(ruta2);
	 try 
	 {
		 FileWriter fw =new FileWriter(file,true);
//	   FileReader fr= new FileReader(file);
//	   BufferedReader br= new BufferedReader(fr);
//	   while((linea= br.readLine())!=null) {
//	    System.out.println(linea);
//	   }
		 fw.write("Hola \n");
		 fw.close();
	 }
	 
	 catch(Exception ex) {
		 ex.printStackTrace();
	 }
 }
}
