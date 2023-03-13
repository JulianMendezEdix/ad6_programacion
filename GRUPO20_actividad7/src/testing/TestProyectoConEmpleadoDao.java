package testing;

import daos.ProyectoConEmpleadoDao;
import daos.ProyectoConEmpleadoDaoImplMy8;
import javabeans.ProyectoConEmpleado;

/**
 * 
 * Esta es la clase testing 'TestProyectoConEmpleadoDao', de la
 * actividad 7 de programacion DAW EDIX23.          
 * 
 * En ella probamos la funcionalidad de los
 * métodos creados en la clase ProyectoConEmpleadoDao.
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class TestProyectoConEmpleadoDao {

	public static void main(String[] args) {
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// INICIALIZACIÓN DE VARIABLES
		///////////////////////////////////////////////////////////////////////////////////////////////////////

		ProyectoConEmpleadoDao pcedao = new ProyectoConEmpleadoDaoImplMy8();
		
		
		for (ProyectoConEmpleado ele: pcedao.empleadosByProyecto("FOR2020001"))
		System.out.println(ele);
		
		
	}

}
