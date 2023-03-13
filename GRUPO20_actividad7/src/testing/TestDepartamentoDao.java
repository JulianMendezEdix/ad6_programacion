package testing;

import daos.DepartamentoDao;
import daos.DepartamentoDaoImplMy8;
import javabeans.Departamento;

/**
 * 
 * Esta es la clase testing 'TestClienteDao', de la
 * actividad 7 de programacion DAW EDIX23.          
 * 
 * En ella probamos la funcionalidad de los
 * métodos creados en la clase ClienteDao.
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class TestDepartamentoDao {

	public static void main(String[] args) {
		
		DepartamentoDao ddao = new DepartamentoDaoImplMy8();
		/*
		Departamento dep = new Departamento(12,"NEGOCIOS", "CALLE ALTA");
		
		System.out.println(ddao.altaDepartamento(dep));
		
		for (Departamento ele: ddao.buscarTodos())
			System.out.println(ele);
		
		System.out.println(ddao.buscarDepartamento(234));
		
		System.out.println(ddao.eliminarDepartamento(234));
		
		System.out.println(ddao.buscarDepartamento(234));
		*/
		for (Departamento ele: ddao.buscarTodos())
			System.out.println(ele);


	}

}
