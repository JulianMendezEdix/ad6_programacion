package testing;

import daos.ClienteDao;
import daos.ClienteDaoImplMy8;
import javabeans.Cliente;

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
public class TestClienteDao {

	public static void main(String[] args) {

		ClienteDao cdao = new ClienteDaoImplMy8();
		
		Cliente cliente = new Cliente("00000000A", "sara", "lopez", "cordoba", 666, 200);
		System.out.println(cdao.eliminarCliente("00000000A"));
		System.out.println(cdao.altaCliente(cliente));
		System.out.println(cdao.buscarCliente("00000000A"));
		for (Cliente ele: cdao.buscarTodos())
			System.out.println(ele);
	}

}
