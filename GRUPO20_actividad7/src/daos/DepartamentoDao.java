package daos;

import java.util.List;

import javabeans.Departamento;

/**
 *  Este es el Interface 'DepartamentoDao' propuesto en la actividad 7.
 *  
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public interface DepartamentoDao {
	
	int altaDepartamento(Departamento departamento);
	int eliminarDepartamento(int idDepar);
	Departamento  buscarDepartamento(int idDepar);
	List<Departamento> buscarTodos();
	
}
