package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

//las clases son modelos,plantillas
//QUE,COMO
public class celular {
	//DETALLES
	//QUE(pantalla,bateria,almacenamiento,modelo,ram)
    //COMO(abrir aplicaciones,navegar internet,whatsapp,mensajes,llamadas)
  int mAh,gb,ram;
  String modelo,dimensiones;
  pantalla display;
  camara[] camaras;
  //miembros por defaul
  String[] fechas;
  String[] dias= {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"
		  ,"once","doce","trece","catorce","quince","dieciseis","diecisietes","dieciocho","diecinueve","veinte","veintiuno","veintidos",
		  "veintitres","veinticuatro","veinticinco","veintiseis","veintisiete","veintiocho","veintinueve","treinta"};
  String[] meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
  public celular() 
  {
	  
  }
  public celular(String modelo) 
  {
	  
  }



public celular(int mAh, int gb, int ram, String modelo, String dimensiones, pantalla display, camara[] camaras) {
	super();
	this.mAh = mAh;
	this.gb = gb;
	this.ram = ram;
	this.modelo = modelo;
	this.dimensiones = dimensiones;
	this.display = display;
	this.camaras = camaras;
}
public int getmAh() {
	return mAh;
}

public void setmAh(int mAh) {
	this.mAh = mAh;
}

public int getGb() {
	return gb;
}

public void setGb(int gb) {
	this.gb = gb;
}

public int getRam() {
	return ram;
}

public void setRam(int ram) {
	this.ram = ram;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getDimensiones() {
	return dimensiones;
}

public void setDimensiones(String dimensiones) {
	this.dimensiones = dimensiones;
}

public pantalla getDisplay() {
	return display;
}
public void setDisplay(pantalla display) {
	this.display = display;
}
public camara[] getCamaras() {
	return camaras;
}
public void setCamaras(camara[] camaras) {
	this.camaras = camaras;
}


@Override
public String toString() {
	return "celular [mAh=" + mAh + ", gb=" + gb + ", ram=" + ram + ", modelo=" + modelo + ", dimensiones=" + dimensiones
			+ ", display=" + display + ", camaras=" + Arrays.toString(camaras) + "]";
}
//comportamientos de 3 formar
//1.Metodos nativos
public  void llamar(String numero) 
 {
	System.out.println("Llamando"+numero);
 }
public  void mandarMensajes(String numero) 
{
	System.out.println("SMS"+numero);
}
public void leerArchivos(String ruta) 
{
	//intancio el array de string
	//determinando su tamaño el metodo anterior
	 fechas =new String[this.contarLineas(ruta)];
	File file=new File(ruta);
	String linea="";
	int index=0;
	
	try 
	{
	  FileReader fr= new FileReader(file);
	  BufferedReader br= new BufferedReader(fr);
	  
	  while((linea=br.readLine())!=null)
		  {
		  //Guardo en cada posicion del array
		  //el contenido de la linea
	       fechas[index]=linea;
	       index++;
		  }
	  
	}catch(Exception ex) 
	{
		ex.printStackTrace();
	}
	
}

//lee el archivo solo para determinar cuantas lineas hay 
//modAcc td nombreMetd(Entrada)
public int contarLineas(String ruta) 
{
	File file=new File(ruta);
	int conteo=0;
	String linea="";
	try 
	{
	  FileReader fr= new FileReader(file);
	  BufferedReader br= new BufferedReader(fr);
	  
	  while((linea=br.readLine())!=null)
		  {
		  conteo++;
		  }
	  
	}catch(Exception ex) 
	{
		ex.printStackTrace();
	}
	return conteo;
}	

public void convertir() 
{
	//Convertir
	int dia=0;
	int mes=0;
	String fechatexto= "";
	
	for(int i=0;i<fechas.length; i++)
	{
		dia= Integer.parseInt(fechas[i].substring(0,2));
		mes= Integer.parseInt(fechas[i].substring(2,4));
		
		fechatexto= dias[dia-1]+" de "+ meses[mes-1]+ " del "+ fechas[i].substring(4);
		fechas[i]=fechatexto;
	}
}

public void escribirArchivos(String ruta)
{
	File file= new File(ruta);
	try 
	{
		FileWriter fw = new FileWriter(file,true);
		for(int k=0; k<fechas.length;k++) 
		{
			fw.write(fechas[k]+"\n");
			
			
		}
		fw.close();
	}catch(Exception ex) 
	{
		ex.printStackTrace();
	}
}


//3.Metodos implementados(traidos de interfaces)

} 

