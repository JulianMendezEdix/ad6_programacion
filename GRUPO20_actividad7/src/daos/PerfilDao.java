package daos;

import java.util.List;

import javabeans.Perfil;

/**
 *  Este es el Interface 'departamentoDao' propuesto en la actividad 7.
 *  
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public interface PerfilDao {
	
	int altaPerfil(Perfil perfil);
	int eliminarPerfil(int idPerfil);
	Perfil buscarPerfil(int idPerfil);
	List <Perfil> buscarTodos();
	
}
