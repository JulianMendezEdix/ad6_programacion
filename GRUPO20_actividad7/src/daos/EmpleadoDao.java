package daos;

import java.util.List;

import javabeans.Empleado;

/**
 *  Este es el Interface 'EmpleadoDao' propuesto en la actividad 7.
 *  
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public interface EmpleadoDao {
	
	int altaEmpleado(Empleado empleado);
	int eliminarEmpleado(int idEmpl);
	Empleado  buscarEmpleado(int idEmpl);
	List<Empleado> buscarTodos();
	List<Empleado> empleadosByDepartamento (int IdDepar);
	List<Empleado> empleadosByGenero(String Genero);
	List<Empleado> empleadosByApellido(String subcadena);
	double salarioTotal();
	double salarioByDepartamento(int idDepar);
}
