package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.EmpleadosDAO;
import com.entity.Empleados;
import com.general.Status;
@Path("empleados/")
public class EmpleadoService {
	Empleados emple=null;
	EmpleadosDAO dao=null;
  @Path("mostrar")
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public List<Empleados> mostrar()
  {
	  dao=new EmpleadosDAO();
	  return dao.mostrar();
  }
    @Path("guardar")
	@POST 
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Empleados e) 
	{
    	System.out.println("guardar" + e);
		Status s= new Status();
		s.setOb(e);
		dao=new EmpleadosDAO();
		String response = dao.guardar(e);
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
    @Path("eliminar/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public Status eliminar(@PathParam("id") int id) 
    {
    	Status state= new Status();
    	state.setOb(id);
    	dao=new EmpleadosDAO() ;
    	String res= dao.eliminar(id);
    	 
    	if(res.equals("1"))
    	{
    		state.setMensaje("Eliminacion exitosa");
    		state.setRespuesta(res);
    		
    	}
    	else 
    	{
    		state.setMensaje("No fue Posible Eliminar");
    		state.setRespuesta(res);
    	}
    	return state;
    }
    @Path("editar")
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Status editar(Empleados item)
    {
    	Status state=new Status();
    	state.setOb(item);
    	dao=new EmpleadosDAO();
    	String res= dao.editar(item);
    	if(res.equals("1")) 
    	{
    		state.setMensaje("Actualizado");
    		state.setRespuesta(res);
    	}else 
    	{
    	  state.setMensaje("No se pudo Actualizar");
    	  state.setRespuesta(res);
    	}
    	
    	return state;
    }
    @Path("buscar/{id}")
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Empleados buscar(@PathParam("id")int id) 
    {
    	dao= new EmpleadosDAO();
    	emple=(Empleados) dao.buscar(id);
    	return emple;
    }
    
    
}
