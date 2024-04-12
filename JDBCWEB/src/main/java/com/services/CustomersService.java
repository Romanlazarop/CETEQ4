package com.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.CustomersDAO;
import com.entity.Customers;
import com.general.Status;

@Path("customers/")
public class CustomersService {
   Customers cust=null;
   CustomersDAO dao=null;
   @Path("guardar")
   @POST
   @Consumes({MediaType.APPLICATION_JSON})
   @Produces({MediaType.APPLICATION_JSON})
   public Status guardar(Customers item) 
   {
	   Status s= new Status();
		s.setOb(item);
		dao=new CustomersDAO();
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

}
