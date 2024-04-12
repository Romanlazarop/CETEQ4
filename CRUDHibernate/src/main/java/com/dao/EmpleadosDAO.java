package com.dao;

import java.sql.DriverManager;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Empleados;
import com.general.Metodos;

public class EmpleadosDAO implements Metodos {
     EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
     EntityManager em= emf.createEntityManager();
     Empleados empleado=null;
	@Override
	public String guardar(Object ob) {
		empleado=(Empleados)ob;
		em.getTransaction().begin();
		String resultados=null;
		try 
		{
		 em.persist(empleado);
		 em.getTransaction().commit();
		 resultados="1";
		 System.out.println("Registro Insertado");
		}catch(Exception ex)
		{
			ex.printStackTrace();
			resultados = ex.getMessage();
			System.out.println("No puedo Insertar");
		}
		em.close();
		return resultados;
	}

	@Override
	public String editar(Object ob) {
		empleado =(Empleados)ob;
		Empleados empleadosdb= em.find(Empleados.class, empleado.getEmpleadoId());
		String r= null;
		em.getTransaction().begin();
		try 
		{
		 empleadosdb.setNombre(empleadosdb.getNombre());
		 empleadosdb.setFecha(empleadosdb.getFecha());
		 empleadosdb.setSalario(empleadosdb.getSalario());
		 em.getTransaction().commit();
		 System.out.println("Editado Correctamente");
		 r="1";
		}catch(Exception ex)
		{
			em.getTransaction().rollback();
			System.out.println("No se pudo Editar");
		    r= ex.getMessage();
		}
		return r;
	}

	@Override
	public String eliminar(int id) {
		String r= null;
		empleado =em.find(Empleados.class, id);
		em.getTransaction().begin();
		try 
		{
		  em.remove(empleado);
		  em.getTransaction().commit();
		  System.out.println("Eliminado");
		  r="1";
		}catch(Exception ex) 
		{
			em.getTransaction().rollback();
			System.out.println("No se pudo Eliminar");
			r= ex.getMessage();
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		empleado= em.find(Empleados.class, id);
		return empleado;
	}

	@Override
	public List mostrar() {
		List<Empleados> ls = em.createQuery("from Empleados").getResultList();//es una consulta hql basado en objetos
		return ls;
	}

}
