package com.services;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.EmpleadosDAO;
import com.entity.Empleados;
import com.general.Status;

@Path("empleados/")
public class EmpleadosServices {
	Empleados emple=null;
	EmpleadosDAO dao=null;
	
	
	@Path("guardar")
	@POST //ayuda a llevar datos al servidor
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Empleados item) 
	{
		Status s= new Status();
		s.setOb(item);
		dao=new EmpleadosDAO();
		String response = dao.guardar(item);
		if(response.equals("1"))
			
		{
			s.setMensaje("Guardado Exitosamente");
		    s.setRespuesta(response);	
		}else 
		{
			s.setMensaje("Error al guardar");
			s.setRespuesta(response);
		}
		return s;
	}
	@Path("actualizar")
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status actualizar(Empleados item) 
	{
		Status s= new Status();
		s.setOb(item);
		dao=new EmpleadosDAO();
		String response = dao.actualizar(item);
		if(response.equals("1"))
			
		{
			s.setMensaje("Actualizado Exitosamente");
		    s.setRespuesta(response);	
		}else 
		{
			s.setMensaje("Error al guardar");
			s.setRespuesta(response);
		}
		return s;
	}
	
	@Path("buscar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Empleados buscar(@PathParam("id")int id ) 
	{
		dao=new EmpleadosDAO();
		
		return (Empleados) dao.buscar(id);
	}
	@Path("eliminar/{id}")
	@DELETE
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id)
	{
		Status s= new Status();
		dao=new EmpleadosDAO();
		String response = dao.eliminar(id);
		if(response.equals("1"))
		{
			s.setMensaje("Eliminacion Exitosa");
			s.setRespuesta(response);
		}else
		{
			s.setMensaje("Error al Eliminar");
			s.setRespuesta(response);
		}
		
		return s;
	}
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Empleados> mostrar()
	{
		dao=new EmpleadosDAO();
		return dao.mostrar();
	}
}
