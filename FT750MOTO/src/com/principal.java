package com;

public class principal {
	
	public static void main(String[] args) 
	{
		motor m1 = new motor("motor dos cilindros en linea", "84mm x 77mm ", 853, 57, "Inyeccion electronica");
	consumo c1 = new consumo(190, 4.2,"Octano 91 " );
	sistemaElectronico s1 = new sistemaElectronico("Alternador 416w", 12);
	trenPotencia t1= new trenPotencia("Embrague hidraulico multidisco", 6, "cadena continua con juntas toricas");
	
	datostecnicos c3 =new datostecnicos(m1, c1, s1, t1);
	System.out.println(c3);
	}

}
