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

import com.dao.ProductoDAO;
import com.dto.DetalleVentaDTO;
import com.dto.ProductosPorClientesDTO;
import com.dto.productoDepInvDTO;
import com.entity.Productos;
import com.general.Status;

@Path("producto/")//ruta a nivel de clase
public class ProductosService {

	Productos prod=null;
	ProductoDAO dao=null;
	
	@Path("mostrar")// endpoint
	@GET //lectura del servidor
	@Produces({MediaType.APPLICATION_JSON})
	
	public List<Productos> mostrar()
	{
		dao=new ProductoDAO();
		return dao.mostrar();
	}
	@Path("guardar")
	@POST //ayuda a llevar datos al servidor
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Productos item) 
	{
		Status s= new Status();
		s.setOb(item);
		dao=new ProductoDAO();
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
	public Status actualizar(Productos item) 
	{
		Status s= new Status();
		s.setOb(item);
		dao=new ProductoDAO();
		String response = dao.actualizar(item);
		if(response.equals("1"))
			
		{
			s.setMensaje("Actualizacion Exitosamente");
		    s.setRespuesta(response);	
		}else 
		{
			s.setMensaje("Error al Actualizar");
			s.setRespuesta(response);
		}
		return s;
	}
	@Path("eliminar/{id}")
	@DELETE //eliminar
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) 
	{
		Status s= new Status();
		dao=new ProductoDAO();
		String response = dao.eliminar(id);
		if(response.equals("1"))
			
		{
			s.setMensaje("Eliminacion Exitosamente");
		    s.setRespuesta(response);	
		}else 
		{
			s.setMensaje("Error al Eliminar");
			s.setRespuesta(response);
		}
		return s;
	}
	@Path("buscar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Productos buscar(@PathParam("id")int id) 
	{
		dao= new ProductoDAO();
		return(Productos) dao.buscar(id);
	}

	@Path("producto-caro")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Productos getProductoCaro() 
	{
		dao= new ProductoDAO();
		return dao.getProductoMasCaro();
	}
	
	@Path("producto-barato")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Productos getProductoBarato()
	{
		dao= new ProductoDAO();
		return dao.getProductobarato();
	}
	@Path("suma")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Double getsuma()
	{
		dao= new ProductoDAO();
		return dao.getsuma();
	}
	@Path("contador-refrigerado")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Integer getcontadorrefrigerado()
	{
		dao= new ProductoDAO();
		return dao.getcontarRefrigerado();
	}
	@Path("invdep")// endpoint
	@GET //lectura del servidor
	@Produces({MediaType.APPLICATION_JSON})
	
	public List<productoDepInvDTO> invdep()
	{
		dao=new ProductoDAO();
		return dao.productosInvDepto();
	}
	@Path("detalle/{nombre}")
	@GET 
	@Produces({MediaType.APPLICATION_JSON})	
	public ProductosPorClientesDTO detalle(@PathParam("nombre")String nombre)
	{
		dao=new ProductoDAO();
		return dao.ProductoPorClienteDTO(nombre);
	}
	
}
