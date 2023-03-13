package daos;

import java.util.List;

import javabeans.ProyectoConEmpleado;

/**
 *  Este es el Interface 'ProyectoConEmpleadoDao' propuesto en la actividad 7.
 *  
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public interface ProyectoConEmpleadoDao {
	
	List<ProyectoConEmpleado> empleadosByProyecto(String idProyecto);
	
	 int asignarEmpleadosAProyecto(List<ProyectoConEmpleado> empleados);
	 
	 int horasAsignadasAProyecto(String idProyecto);
	 //Suma de las horas de los empleados asignados al proyecto.
	 
	 double  costeActualDeProyecto(String idProyecto);
	 //horas*coste-hora de cada empleado asignado al proyecto.
	 
	 double margenActualProyecto(String idProyecto);
	 //Importe_venta del proyecto – costeActual del Proyecto

}
