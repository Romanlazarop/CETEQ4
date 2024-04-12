package com;

import java.util.ArrayList;
import java.util.List;

public class principal {
	public static void main(String[] args) 
	{
		List<Cuenta> listita =new ArrayList<Cuenta>();
		Cuenta c1= new Cuenta("001", "3452-2424-5667-5345", 250001.00, 5000.00, 300000.00, "Debito", "6343");
		Cuenta c2= new Cuenta("002", "3452-2424-5667-5346", 250002.00, 5000.00, 300000.00, "Debito", "6344");
		Cuenta c3= new Cuenta("003", "3452-2424-5667-5347", 250003.00, 5000.00, 300000.00, "Debito", "6345");
		Cuenta c4= new Cuenta("004", "3452-2424-5667-5349", 250004.00, 5000.00, 300000.00, "Debito", "6346");
		Cuenta c5= new Cuenta("005", "3452-2424-5667-5347", 250005.00, 5000.00, 300000.00, "Debito", "6345");
		 listita.add(c1);
		 listita.add(c2);
		 listita.add(c3);
		 listita.add(c4);
		 listita.add(c5);
		//Map<String.Auto> registro=new HashMap<String.Auto>();
		cajeroATM atm=new cajeroATM("Av.juarez 503", "BBVAtm0010", listita);
	    //atm.cosultaSaldo("3452-2424-5667-5345");
		//atm.retirar("3452-2424-5667-5345", 500);
		//atm.buscarcuenta("3452-2424-5667-5347");
		//atm.cambioNip();
		ticket t1=(ticket)atm.retirar("3452-2424-5667-5345", 500)[0] ;
	    System.out.println(t1);
	    Cuenta ct1 =(Cuenta)atm.buscarcuenta("3452-2424-5667-5345")[0];
	    System.out.println(ct1);
	    atm.cosultaSaldo("3452-2424-5667-5345");
	}

}
