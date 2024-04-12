package com.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Empleados;
import com.general.Database;
import com.general.Metodos;

public class EmpleadosDAO implements Metodos{
	Connection con = null;// Abre la conexion
	PreparedStatement ps = null;// Lleva las instrucciones
	ResultSet rs = null;// Traer los datos de la db

	Empleados emple = null;// comodin para manipular las respuestas de cada operacion
	Database db = new Database();
	String respuesta;
	
	@Override
	public String guardar(Object obj) {
		emple= (Empleados) obj;
		String query="INSERT INTO EMPLEADOS (NOMBRE,FECHA_INGRESO,SALARIO) VALUES (?,?,?)";
		try 
		{
		 Class.forName(db.getDriver());
		 con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
		 ps = con.prepareStatement(query);
		 
		 ps.setString(1, emple.getNombre());
		 ps.setDate(2, emple.getFechaIngreso());
		 ps.setDouble(3, emple.getSalario());
			int x=ps.executeUpdate();
			if(x>0) 
			{
				System.out.println("Inserte Ok");
				respuesta ="1";
			}
			else 
			{
				System.out.println("Error");
				respuesta="0";
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
			respuesta = ex.getMessage();
		}
		return respuesta;
	}
	@Override
	public String actualizar(Object obj) {
		emple= (Empleados) obj;
		String query = "UPDATE EMPLEADOS SET NOMBRE = ?,FECHA_INGRESO = ?,SALARIO = ? "+ "WHERE EMPLEADO_ID= ?";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			ps.setString(1, emple.getNombre());
			ps.setDate(2, emple.getFechaIngreso());
			ps.setDouble(3, emple.getSalario());			
			ps.setInt(4, emple.getEmpleadoId());

			int x = ps.executeUpdate();

			if (x > 0) {
				System.out.println("Inserte Ok");
				respuesta = "1";
			} else {
				System.out.println("Error");
				respuesta = "0";
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			respuesta = ex.getMessage();
		}

		return respuesta;
	}
	@Override
	public Object buscar(int id) {
		String query= "SELECT * FROM EMPLEADOS WHERE EMPLEADO_ID=" +id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) 
			{
				emple= new Empleados(rs.getInt("EMPLEADO_ID"), rs.getString("NOMBRE"), 
						rs.getDate("FECHA_INGRESO"), rs.getDouble("SALARIO")) ;
				
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		} 
			return emple;
	}
	@Override
	public String eliminar(int id) {
		String query="DELETE EMPLEADOS WHERE EMPLEADO_ID=" +id;
		try 
		{
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			int x= ps.executeUpdate();
			if(x>0) 
			{
				System.out.println("Eliminadcion Ok");
				respuesta="1";
			}else 
			{
				System.out.println("Error");
				respuesta="0";
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
			respuesta = ex.getMessage();
		}
		return respuesta;
	}
	@Override
	public List mostrar() {
		String query ="SELECT * FROM EMPLEADOS";
		List<Empleados> Empleados =new ArrayList<Empleados>();
		try 
		{
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) 
			{
				emple =new Empleados(rs.getInt("EMPLEADO_ID"), rs.getString("NOMBRE"), 
						rs.getDate("FECHA_INGRESO"), rs.getDouble("SALARIO"));
				Empleados.add(emple);
			}
		}catch (Exception ex) 
		{
			ex.printStackTrace();
			}
		return Empleados;
	}

}
