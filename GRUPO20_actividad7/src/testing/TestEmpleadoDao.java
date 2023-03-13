package testing;

import daos.DepartamentoDao;
import daos.DepartamentoDaoImplMy8;
import daos.EmpleadoDao;
import daos.EmpleadoDaoImplMy8;
import daos.PerfilDao;
import daos.PerfilDaoImplMy8;
import javabeans.Departamento;
import javabeans.Empleado;
import javabeans.Perfil;
import java.sql.Date;

/**
 * 
 * Esta es la clase testing 'TestEmpleadoDao', de la
 * actividad 7 de programacion DAW EDIX23.          
 * 
 * En ella probamos la funcionalidad de los
 * métodos creados en la clase EmpleadoDao.
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class TestEmpleadoDao {

	public static void main(String[] args) {
		
		
		EmpleadoDao edao = new EmpleadoDaoImplMy8();
		
		java.util.Date fechaUtil = new java.util.Date();
		Date fechaIngreso = new Date(fechaUtil.getTime());

		java.util.Date fechaUtil2 = new java.util.Date();
		Date fechaNacimiento = new Date(fechaUtil2.getTime());
		// El empleado no nace cuando lo damos de alta... pero, pelillos a la mar... tengo que estudiarme
		// el tema de las fechas.

		PerfilDao pdao = new PerfilDaoImplMy8();
		Perfil per = new Perfil(50,"ASTRONAUTA",10);
		System.out.println(pdao.altaPerfil(per));
		
		DepartamentoDao ddao = new DepartamentoDaoImplMy8();
		Departamento dep = new Departamento(234,"NEGOCIOS", "CALLE ALTA");
		System.out.println(ddao.altaDepartamento(dep));
		
		Empleado emp = new Empleado(250, "JULIAN", "MENDEZ PODADERA", 
				"JMENDEZPOD@GMAIL.COM", "H" ,"JULIAN" , 20000 , fechaIngreso, fechaNacimiento,
				per, dep);
		
		System.out.println(edao.altaEmpleado(emp));
		
		System.out.println(edao.buscarEmpleado(250));
		
		for (Empleado ele: edao.buscarTodos())
		System.out.println(ele);
		
		for (Empleado ele: edao.buscarTodos())
			System.out.println(ele);
		
		for (Empleado ele: edao.empleadosByDepartamento(20))
			System.out.println(ele);
		
		for (Empleado ele: edao.empleadosByGenero("M"))
			System.out.println(ele);
		
		for (Empleado ele: edao.empleadosByApellido("me"))
			System.out.println(ele);
		
		System.out.println(edao.salarioTotal());
		
		System.out.println(edao.salarioByDepartamento(20));
		
		
		
		//System.out.println(edao.buscarEmpleado(234));
		
		//System.out.println(edao.eliminarEmpleado(250));
		

		
		//for (Empleado ele: edao.buscarTodos())
			//System.out.println(ele);

	}

}
