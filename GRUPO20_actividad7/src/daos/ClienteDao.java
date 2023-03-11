package daos;

import java.util.List;

import javabeans.Cliente;

/**
 *  Este es el Interface 'ClienteDao' propuesto en la actividad 7.
 *  
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public interface ClienteDao {
	

	int altaCliente(Cliente cliente);
	int eliminarCliente(String cif);
	Cliente  buscarCliente(String cif);
	List<Cliente> buscarTodos();

}
