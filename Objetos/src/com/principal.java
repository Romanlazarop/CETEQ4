package com;

public class principal {
	public static void main(String[] args) 
	{
		camara c1= new camara("2400", 1.8, 200, "10x");
		camara[] cams = {c1};
		celular cel= new celular();
        pantalla p1 = new pantalla(6.7, "OLED", 801);
		//celular cel2=new celular(4000, 128, 12, "K9", "15X8X1.0");
		
        //System.out.println(cel);
		//System.out.println(cel2);
		
		//cel.setModelo("M19");
		//cel.setDimensiones("18x12x2");
		//cel.setGb(64);
		//cel.setmAh(6000);
		//cel.setRam(12);
		
		//System.out.println(cel);
		
		
		//automovil aut= new automovil("AUDDI","A3", 3.2, 500000, 200, "2Lx100KM");
		
	    //aut.automovilM();
		//System.out.println(aut);
		
        
		//cel.leerArchivos("C:\\Users\\ThinkPad\\Desktop\\lectura.txt");
		//cel.convertir();
		//cel.escribirArchivos("C:\\Users\\ThinkPad\\Desktop\\escritura.txt")
        celular c3=new celular(4000, 128, 12, "k9", "acme", p1, cams);
	System.out.println(c3);
	}

}
