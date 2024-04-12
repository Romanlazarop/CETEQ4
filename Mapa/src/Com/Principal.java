package Com;

import java.util.HashMap;
import java.util.Map;

public class Principal {
	public static void main(String[] args ) 
	{
		Map<String, String > alumnos=new HashMap<String, String>();
		Map<String, Alumnos > alumnos2=new HashMap<String, Alumnos>();
		//Map<String, List<Ciudad> > alumnos2=new HashMap<String, Alumnos>();
		
		alumnos2.put("000023", new Alumnos());
		
		
		//Agrego valores
		alumnos.put("00010", "Pepito");
		alumnos.put("00020", "Claudia");
		alumnos.put("00030", "Lorena");
		alumnos.put("00040", "Miguel");
		alumnos.put("00050", "Jessica");
		//tamaño
		System.out.println(alumnos.size());
		//Obtener un valor en especifico
		System.out.println(alumnos.get("00030"));
		//Contiene la llave o el valor
		System.out.println(alumnos.containsKey("0030"));
		System.out.println(alumnos.containsValue("Samanta"));
		//Extrae solamente la columna de los valores
		System.out.println(alumnos.values());//getClass()la clase que es;
		//Extrae solamente la columnas de las llaves
		System.out.println(alumnos.keySet());
		
		//Elimina un regisro del mapa 
		alumnos.remove("00040");
		System.out.println(alumnos);
		
		//Elimina un registro solo si el valor asociado es el correcto
		alumnos.remove("00050", "Jessica");
		System.out.println(alumnos);
		
		alumnos.replace("00010", "Pepito","Susana");
		System.out.println(alumnos);
		

		
	}

}
