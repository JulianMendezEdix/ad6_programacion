package daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.AbstractConexionDaoMy8;
import javabeans.Departamento;

/**
 * 
 * Esta es la clase ' DepartamentoDaoImplMy8' que implementa
 * el Interface 'DepartamentoDao' requerido en la 
 * actividad 7 de programacion DAW EDIX23.                                       
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public class DepartamentoDaoImplMy8 extends AbstractConexionDaoMy8 
	implements DepartamentoDao {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS DE IMPLEMENTACIÓN
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 	
	 * Método de Implementación de la clase interface 'DepartamentoDao"
	 * que da el alta de un Departamento en la BBDD.
     * 
	 * 
	 * @param persona Instancia de la clase 'Departamento' que queremos añadir.
	 * @return int  Si se añade el Departamento devuleve 1, si no, 0;
	 * 
	 */	
	@Override
	public int altaDepartamento(Departamento departamento) {
		sql = "INSERT INTO DEPARTAMENTOS VALUES(?,?,?);";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, departamento.getIdDepar());
			ps.setString(2, departamento.getNombre());
			ps.setString(3, departamento.getDireccion());;
			filas = ps.executeUpdate();
			// filas=1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int eliminarDepartamento(int idDepar) {
		sql = "DELETE FROM DEPARTAMENTOS WHERE id_depar = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idDepar);
			filas = ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Departamento buscarDepartamento(int idDepar) {
		sql = "SELECT * FROM DEPARTAMENTOS WHERE id_depar = ?";
		Departamento dep = null;
		try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, idDepar);
				rs= ps.executeQuery();
				if (rs.next()) {
					dep = new Departamento();
					dep.setIdDepar(rs.getInt("id_depar"));
					dep.setNombre(rs.getString("nombre"));
					dep.setDireccion(rs.getString("direccion"));
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return dep;
	}

	/**
	 * Método que devuelve la lista completa de departamentos de la BBDD.
	 * 
	 * @return List
	 * @since 1.0
	 */
	@Override
	public List<Departamento> buscarTodos() {
			sql = "SELECT * FROM DEPARTAMENTOS";
			List<Departamento> departamentos = new ArrayList<>();
			try {
					ps = conn.prepareStatement(sql);
					rs= ps.executeQuery();
					while (rs.next()) {
						Departamento dep = new Departamento();
						dep.setIdDepar(rs.getInt("id_depar"));
						dep.setNombre(rs.getString("nombre"));
						dep.setDireccion(rs.getString("direccion"));
						departamentos.add(dep);
					}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			return departamentos;

	}
	
	

}
