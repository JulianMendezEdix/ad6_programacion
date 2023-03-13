package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * Esta es la clase abstracta  requerida en la 
 * actividad 7 de programacion DAW EDIX23.                                       
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class AbstractConexionDaoMy8 {
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	// ATRIBUTOS PRIVADOS
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	protected Connection conn = null;
	protected String sql = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	protected int filas;

	////////////////////////////////////////////////////////////////////////////////////////////////////
	// CONSTRUCTOR
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public AbstractConexionDaoMy8() {
		String url = 
				"jdbc:mysql://localhost:3306/clientes_proyectos_empleados_2023?serverTimezone=UTC";
		String username = "root";
		String pwd = "root";
		try {
			conn = DriverManager.getConnection(url, username, pwd);
			System.out.println("Conexión establecida");
		} catch (SQLException e) {
			System.out.println("No se ha podido establecer la conexión");
			e.printStackTrace(); 
		}
	}
}
