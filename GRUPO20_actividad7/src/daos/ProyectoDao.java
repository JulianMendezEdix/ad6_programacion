package daos;

import java.util.List;

import javabeans.Proyecto;

/**
 *  Este es el Interface 'ProyectoDao' propuesto en la actividad 7.
 *  
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public interface ProyectoDao {
	
	int altaProyecto(Proyecto proyecto);
	
	int eliminarProyecto(String idProyecto);
	
	Proyecto  buscarProyecto(String idProyecto);
	
	List<Proyecto> buscarTodos();
	
	List<Proyecto> proyectosByEstado(String estado);
	
	List<Proyecto> proyectosByCliente(String cif);
	
	List<Proyecto> proyectosByJefeProyectoAndByEstado(int jefeProyecto, String estado);
	
	double importesVentaProyectosTerminados();
	
	double margenBrutoProyectosTerminados();
	//Diferencia suma Importes venta y gastos reales.
	
	int diasATerminoProyectoActivo(String idProyecto);
	//Cuantos días quedan para terminar el proyecto (diferencia entre fecha_fin_previsto y la fecha de hoy
	
	
	
	
	

}
