package daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.AbstractConexionDaoMy8;
import javabeans.Perfil;

/**
 * 
 * Esta es la clase 'PerfilDaoImplMy8' que implementa
 * el Interface 'PerfilDao' requerido en la 
 * actividad 7 de programacion DAW EDIX23.                                       
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public class PerfilDaoImplMy8 extends AbstractConexionDaoMy8 implements PerfilDao {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS DE IMPLEMENTACIÓN
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 	
	 * Método de Implementación de la clase interface 'PerfilDao"
	 * que da el alta de un cliente en la BBDD.
     * 
	 * 
	 * @param persona Instancia de la clase 'Perfil' que queremos añadir.
	 * @return int  Si se añade el Perfil devuleve 1, si no, 0;
	 * 
	 */	
	@Override
	public int altaPerfil(Perfil perfil) {
		sql = "INSERT INTO PERFILES VALUES(?,?);";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, perfil.getIdPerfil());
			ps.setString(2, perfil.getNombre());
			filas = ps.executeUpdate();
			// filas=1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int eliminarPerfil(int idPerfil) {
		sql = "DELETE FROM PERFILES WHERE id_perfil = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idPerfil);
			filas = ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Perfil buscarPerfil(int idPerfil) {
		sql = "SELECT * FROM PERFILES WHERE id_perfil = ?";
		Perfil per = null;
		try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, idPerfil);
				rs= ps.executeQuery();
				if (rs.next()) {
					per = new Perfil();
					per.setIdPerfil(rs.getInt("id_perfil"));
					per.setNombre(rs.getString("nombre"));
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return per;
	}

	@Override
	public List<Perfil> buscarTodos() {
		sql = "SELECT * FROM PERFILES";
		List<Perfil> perfiles = new ArrayList<>();
		try {
				ps = conn.prepareStatement(sql);
				rs= ps.executeQuery();
				while (rs.next()) {
					Perfil per = new Perfil();
					per.setIdPerfil(rs.getInt("id_perfil"));
					per.setNombre(rs.getString("nombre"));
					perfiles.add(per);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return perfiles;
	}

}
