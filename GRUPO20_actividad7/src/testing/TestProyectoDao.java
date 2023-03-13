package testing;

import java.sql.Date;

import daos.ClienteDao;
import daos.ClienteDaoImplMy8;
import daos.DepartamentoDao;
import daos.DepartamentoDaoImplMy8;
import daos.EmpleadoDao;
import daos.EmpleadoDaoImplMy8;
import daos.PerfilDao;
import daos.PerfilDaoImplMy8;
import daos.ProyectoDao;
import daos.ProyectoDaoImplMy8;
import javabeans.Cliente;
import javabeans.Departamento;
import javabeans.Empleado;
import javabeans.Perfil;
import javabeans.Proyecto;

/**
 * 
 * Esta es la clase testing 'TestProyectoDao', de la
 * actividad 7 de programacion DAW EDIX23.          
 * 
 * En ella probamos la funcionalidad de los
 * métodos creados en la clase ProyectoDao.
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class TestProyectoDao {

	public static void main(String[] args) {

		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// INICIALIZACIÓN DE VARIABLES
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		ProyectoDao pdao = new ProyectoDaoImplMy8();
		


		java.util.Date fechaUtil = new java.util.Date();
		Date fechaIngreso = new Date(fechaUtil.getTime());

		java.util.Date fechaUtil2 = new java.util.Date();
		Date fechaNacimiento = new Date(fechaUtil2.getTime());
		// El empleado no nace cuando lo damos de alta... pero, pelillos a la mar... tengo que estudiarme
		// el tema de las fechas.
		
		PerfilDao perdao = new PerfilDaoImplMy8();
		Perfil per = new Perfil(50,"ASTRONAUTA",10);
		System.out.println(perdao.altaPerfil(per));
		
		DepartamentoDao ddao = new DepartamentoDaoImplMy8();
		Departamento dep = new Departamento(234,"NEGOCIOS", "CALLE ALTA");
		System.out.println(ddao.altaDepartamento(dep));
		
		EmpleadoDao edao = new EmpleadoDaoImplMy8();
		Empleado emp = new Empleado(250, "JULIAN", "MENDEZ PODADERA", 
				"JMENDEZPOD@GMAIL.COM", "H" ,"JULIAN" , 20000 , fechaIngreso, fechaNacimiento,
				per, dep);
		System.out.println(edao.altaEmpleado(emp));
		
		
		
		ClienteDao cdao = new ClienteDaoImplMy8();
		Cliente cli = new Cliente("00000000A", "sara", "lopez", "cordoba", 666, 200);
		System.out.println(cdao.altaCliente(cli));
		
		java.util.Date fechaUtil3 = new java.util.Date();
		Date d1 = new Date(fechaUtil3.getTime());

		java.util.Date fechaUtil4 = new java.util.Date();
		Date d2 = new Date(fechaUtil4.getTime());
		
		java.util.Date fechaUtil5 = new java.util.Date();
		Date d3 = new Date(fechaUtil5.getTime());
		
		Proyecto pro = new Proyecto("FOR2020002", "'Formacion de habilidades directivas 2.0", d1, d2, 
				d3, 50000, 30000, 315000, "Terminado", emp, cli);
		 

		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		//                    TESTS
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println(pdao.altaProyecto(pro));
		
		System.out.println(pdao.eliminarProyecto("FOR2020002"));
		

		System.out.println(pdao.buscarProyecto("FOR2020001"));
		
		for (Proyecto ele: pdao.buscarTodos())
		System.out.println(ele);
		
		for (Proyecto ele: pdao.proyectosByEstado("terminado"))
		System.out.println(ele);
		
		for (Proyecto ele: pdao.proyectosByCliente("A22222222"))
		System.out.println(ele);
		
		for (Proyecto ele: pdao.proyectosByJefeProyectoAndByEstado(114,"TERMINADO"))
		System.out.println(ele);

		
		System.out.println(pdao.importesVentaProyectosTerminados());

		
		System.out.println(pdao.margenBrutoProyectosTerminados());
		
		System.out.println(pdao.diasATerminoProyectoActivo("FOR2020001"));
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
