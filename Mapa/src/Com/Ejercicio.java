package Com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args)
	{
		
		String id;
		String nombre;
		String direccion;
		int edad ;
		char sexo;
		String fechaNac;
		Map<String, Alumnos > alumnos=new HashMap<String, Alumnos>();
		Scanner sc=new Scanner(System.in);
		int op;
		
		Alumnos al = null;
		do {
			System.out.println("1 - Agrega un alumno");
			System.out.println("2 - Buscar por nombre");
			System.out.println("3 - Buscar por numero de control");
			System.out.println("4 - Editar");
			System.out.println("5 - Eliminar");
			System.out.println("6 - Mostrar todos");
			
			System.out.println("Selecciona una opcion:");
			op=sc.nextInt();
			switch(op) 
			{
			case 1:
				sc.nextLine();
				System.out.println("Agrega Id: ");
				id=sc.nextLine();
				System.out.println("Agrega nombre: ");
				nombre=sc.nextLine();
				System.out.println("Agrega Direccion: ");
				direccion=sc.nextLine();
				System.out.println("Agrega edad:" );
				edad=sc.nextInt();
				System.out.println("Agrega sexo:" );
				sexo=sc.next().charAt(0);
				sc.nextLine();
				System.out.println("Agrega fecha de nacimiento:");
				fechaNac= sc.nextLine();
				
				alumnos.put( id, new Alumnos(nombre, direccion, edad, sexo, fechaNac));
				System.out.println("Se agrego: "+ alumnos+ "\n");
				
				break;
			case 2:
				sc.nextLine();
				System.out.println("Ingresa el nombre: ");
				nombre=sc.nextLine();
				
				
				for (String key : alumnos.keySet()) {
					
					if(alumnos.get(key).getNombre().equals(nombre)) {
						al = alumnos.get(key);
						break;
					}
				}
				
				if(al!=null) {
					System.out.println(al);
				}else {
					System.out.println("El alumno no existe");
				}
				break;
			case 3:
				//Reseta la variable global
				al = null;				
				sc.nextLine();
				System.out.println("Ingresa el ID: ");
				id=sc.nextLine();
				
				al = alumnos.get(id);
				
				if(al!=null) {
					System.out.println("Detalles: "+al);
				}else {
					System.out.println("No existe");
				}
				
				
				
				break;
			case 4:
				sc.nextLine();
				System.out.println("Ingresa el ID: ");
				id=sc.nextLine();
				System.out.println("Agrega nombre: ");
				nombre=sc.nextLine();
				System.out.println("Agrega Direccion: ");
				direccion=sc.nextLine();
				System.out.println("Agrega edad:" );
				edad=sc.nextInt();
				System.out.println("Agrega sexo:" );
				sexo=sc.next().charAt(0);
				sc.nextLine();
				System.out.println("Agrega fecha de nacimiento:");
				fechaNac= sc.nextLine();
				
				alumnos.replace(id, new Alumnos(nombre, direccion, edad, sexo, fechaNac));
				System.out.println(alumnos);
				break;
			case 5:
				sc.nextLine();
				System.out.println("Ingresa el ID: ");
				id=sc.nextLine();
				alumnos.remove(id);
				System.out.println(alumnos);
				
				break;
			case 6:
				sc.nextLine();
				System.out.println("Lista de alumnos: ");
				System.out.println(alumnos.values());
				
				break;
			}
		}while(true);
		
		
	}

}
