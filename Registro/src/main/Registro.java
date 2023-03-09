package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ventanas.VentanaMain;

public class Registro {

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/pruebaCRUD";
	private static final String USUARIO = "root";
	private static final String CLAVE = "abcd*1234";
	
	public Connection conectar() {
		Connection conexion = null;
		
		try {
			Class.forName(CONTROLADOR);
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexion correcta");
		
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar la BD");
			e.printStackTrace();
	
		} catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		
		}
		return conexion;
	}

	public static void main(String[] args) {
		conectar();
		
		VentanaMain main = new VentanaMain();
		main.setVisible(true);

		
	}

}
