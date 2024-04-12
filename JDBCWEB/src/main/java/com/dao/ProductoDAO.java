package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.DetalleVentaDTO;
import com.dto.ProductosPorClientesDTO;
import com.dto.productoDepInvDTO;
import com.entity.Productos;
import com.general.Database;
import com.general.Metodos;

public class ProductoDAO implements Metodos {

	Connection con = null;// Abre la conexion
	PreparedStatement ps = null;// Lleva las instrucciones
	ResultSet rs = null;// Traer los datos de la db
    
	Productos prod = null;// comodin para manipular las respuestas de cada operacion
	Database db = new Database();
	String respuesta;

	@Override
	public String guardar(Object obj) {
		prod = (Productos)obj;
		String query = "INSERT INTO PRODUCTOS(DEPTO_ID,NOMBRE,FECHA_CAD,PRECIO_COMPRA,PRECIO_VENTA,REFRIGERADO) VALUES (?,?,?,?,?,?)";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);

			ps.setInt(1, prod.getDeptoId());
			ps.setString(2, prod.getNombre());
			ps.setDate(3, prod.getFechaCaducidad());
			ps.setDouble(4, prod.getPrecioCompra());
			ps.setDouble(5, prod.getPrecioVenta());
			ps.setString(6, Character.toString(prod.getRefrigerado()));
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
	public String actualizar(Object obj) {
		prod = (Productos)obj;
		String query = "UPDATE PRODUCTOS SET DEPTO_ID = ?,NOMBRE= ?,FECHA_CAD= ?,PRECIO_COMPRA= ?,PRECIO_VENTA= ?,REFRIGERADO= ? "
				+ "WHERE PRODUCTO_ID= ?";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);

			ps.setInt(1, prod.getDeptoId());
			ps.setString(2, prod.getNombre());
			ps.setDate(3, prod.getFechaCaducidad());
			ps.setDouble(4, prod.getPrecioCompra());
			ps.setDouble(5, prod.getPrecioVenta());
			ps.setString(6, Character.toString(prod.getRefrigerado()));
			ps.setInt(7, prod.getProductoId());

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
		// TODO Auto-generated method stub
		return respuesta;
	}

	@Override
	public Object buscar(int id) {
		String query = "SELECT * FROM PRODUCTOS WHERE PRODUCTO_ID=" + id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				prod = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"),
						rs.getDate("FECHA_CAD"), rs.getDouble("PRECIO_COMPRA"), rs.getDouble("PRECIO_VENTA"),
						rs.getString("REFRIGERADO").charAt(0));

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return prod;
	}

	@Override
	public String eliminar(int id) {
		String query = "DELETE PRODUCTOS WHERE PRODUCTO_ID=" + id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			int x = ps.executeUpdate();
			if (x > 0) {
				System.out.println("Eliminacion Ok");
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
	public List mostrar() {
		String query = "SELECT * FROM PRODUCTOS";
		List<Productos> productos = new ArrayList<Productos>();
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				prod = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"),
						rs.getDate("FECHA_CAD"), rs.getDouble("PRECIO_COMPRA"), rs.getDouble("PRECIO_VENTA"),
						rs.getString("REFRIGERADO").charAt(0));
				productos.add(prod);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return productos;
	}
	
	
	public Productos getProductoMasCaro() 
	{
		String query = "SELECT * FROM PRODUCTOS WHERE PRECIO_VENTA =(SELECT MAX(PRECIO_VENTA) FROM PRODUCTOS)";
      
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				prod = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"),
						rs.getDate("FECHA_CAD"), rs.getDouble("PRECIO_COMPRA"), rs.getDouble("PRECIO_VENTA"),
						rs.getString("REFRIGERADO").charAt(0));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return prod;
	}
		public Productos getProductobarato() 
		{
			String query = "SELECT * FROM PRODUCTOS WHERE PRECIO_VENTA =(SELECT MIN(PRECIO_VENTA) FROM PRODUCTOS)";
	      
			try {
				Class.forName(db.getDriver());
				con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					prod = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"),
							rs.getDate("FECHA_CAD"), rs.getDouble("PRECIO_COMPRA"), rs.getDouble("PRECIO_VENTA"),
							rs.getString("REFRIGERADO").charAt(0));
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return prod;
	}
		public Double getsuma()
		    {
			String query = "SELECT SUM(PRECIO_COMPRA) AS SUMATORIA FROM PRODUCTOS";
			double suma=0;
			try {
				Class.forName(db.getDriver());
				con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					suma = rs.getDouble("SUMATORIA");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return suma;
			}
		public Integer getcontarRefrigerado()
		{
			String query = "SELECT COUNT(PRODUCTO_ID) AS CONTADOR FROM PRODUCTOS WHERE REFRIGERADO='Y'";
			int contar=0;
			try {
				Class.forName(db.getDriver());
				con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					contar = rs.getInt("CONTADOR");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return contar;
		}
		public List<productoDepInvDTO> productosInvDepto() 
		{
			productoDepInvDTO dto =null;
			String query = "SELECT D.NOMBRE AS DEPTO, P.NOMBRE AS PRODUCTO, P.PRECIO_COMPRA, P.REFRIGERADO,I.STOCK, I.FECHA FROM PRODUCTOS P INNER JOIN INVENTARIO I ON P.PRODUCTO_ID = I.PRODUCTO_ID INNER JOIN DEPARTAMENTO D ON D.DEPTO_ID = P.DEPTO_ID WHERE P.REFRIGERADO = 'Y'";
			List<productoDepInvDTO> detalles = new ArrayList<productoDepInvDTO>();
			try {
				Class.forName(db.getDriver());
				con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					dto = new productoDepInvDTO(rs.getString("DEPTO"),rs.getString("PRODUCTO"), rs.getDouble("PRECIO_COMPRA")
							, rs.getString("REFRIGERADO").charAt(0), rs.getInt("STOCK"), rs.getDate("FECHA"));
					detalles.add(dto);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return detalles;
		}

		
		
		
		public ProductosPorClientesDTO ProductoPorClienteDTO(String nombre) 
		{
			String cliente = "";
			ProductosPorClientesDTO pcl = null;
			DetalleVentaDTO dtv = null;
			String query ="SELECT C.NOMBRE,V.FECHA_VENTA,D.CANTIDAD,P.NOMBRE AS NOMBREPRODUCTO FROM CUSTOMERS C INNER JOIN VENTAS V ON C.CLIENTE_ID = V.CLIENTE_ID INNER JOIN DET_VENTA D ON V.VENTA_ID = D.VENTA_ID INNER JOIN PRODUCTOS P ON D.PRODUCTO_ID = P.PRODUCTO_ID WHERE C.NOMBRE = '" 
			+nombre+"'";
			List<DetalleVentaDTO> detalles = new ArrayList<DetalleVentaDTO>();
			try {
				Class. forName(db.getDriver());
				con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
				ps = con.prepareStatement (query);
				rs = ps. executeQuery();
			while (rs.next()) 
			{
				dtv = new DetalleVentaDTO(rs.getDate("FECHA_VENTA"), rs.getInt("CANTIDAD"),
						rs.getString("NOMBREPRODUCTO"));

						detalles.add(dtv);
						cliente = rs.getString("NOMBRE");		
			}
			pcl = new ProductosPorClientesDTO(cliente, detalles);
			}catch (Exception ex) {
				ex.printStackTrace();
			}
			return pcl ;
		}

}
