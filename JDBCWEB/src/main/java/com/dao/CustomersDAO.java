package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.entity.Customers;
import com.general.Database;
import com.general.Metodos;

public class CustomersDAO implements Metodos{
	Connection con = null;// Abre la conexion
	PreparedStatement ps = null;// Lleva las instrucciones
	ResultSet rs = null;// Traer los datos de la db
	Customers cust=null;
	Database db =new Database();
	String respuesta;
	@Override
	public String guardar(Object obj) {
		 cust = (Customers)obj;
		 String query ="INSERT INTO CUSTOMERS (NOMBRE,FECHA_NAC,DOMICILIO) VALUES (?,?,?)";
		try 
		{
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			ps.setString(1, cust.getNombre());
			ps.setDate(2, cust.getFechaNac());
			ps.setString(3, cust.getDomicilio());
			int x = ps.executeUpdate();

			if (x > 0) {
				System.out.println("Inserte Ok");
				respuesta = "1";
			} else {
				System.out.println("Error");
				respuesta = "0";
			}
		
		}catch(Exception ex) {
			ex.printStackTrace();
			respuesta = ex.getMessage();
		}
		 return respuesta;
	}

	@Override
	public String actualizar(Object prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
