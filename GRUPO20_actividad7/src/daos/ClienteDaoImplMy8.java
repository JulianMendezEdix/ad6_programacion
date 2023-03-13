package daos;

import java.util.List;

import conexion.AbstractConexionDaoMy8;

import java.sql.SQLException;
import java.util.ArrayList;
import javabeans.Cliente;

/**
 * 
 * Esta es la clase 'clienteDaoImplMy8' que implementa
 * el Interface 'ClienteDao' requerido en la 
 * actividad 7 de programacion DAW EDIX23.                                       
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public class ClienteDaoImplMy8 extends AbstractConexionDaoMy8  implements ClienteDao {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS DE IMPLEMENTACIÓN
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 	
	 * Método de Implementación de la clase interface 'ClienteDao"
	 * que da el alta de un cliente en la BBDD.
     * 
	 * 
	 * @param persona Instancia de la clase 'Persona' que queremos añadir.
	 * @return int  Si se añade el cliente devuleve 1, si no, 0;
	 * 
	 */	
	@Override
	public int altaCliente(Cliente cliente) {
		sql = "INSERT INTO CLIENTES VALUES(?,?,?,?,?,?);";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cliente.getCif());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getApellidos());
			ps.setString(4, cliente.getDomicilio());
			ps.setFloat(5, cliente.getFacturacionAnual());
			ps.setInt(6, cliente.getNumeroEmpleados());
			filas = ps.executeUpdate();
			// filas=1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}
	
	/**
	 * Método que busca y devuelve una persona en concreto<br>
	 * pasándole su NIF.
	 * 
	 * @param cif String con la "calve primaria" del cliente
	 * @return Cliente Devuelve la persona con el CIF que se le pase<br>
	 *   o NULL si no la encuentra.
	 *   
	 */
	@Override
	public Cliente buscarCliente(String cif) {
		sql = "SELECT * FROM CLIENTES WHERE cif = ?";
		Cliente cli = null;
		try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, cif);
				rs= ps.executeQuery();
				if (rs.next()) {
					cli = new Cliente();
					cli.setCif(rs.getString("cif"));
					cli.setNombre(rs.getString("nombre"));
					cli.setApellidos(rs.getString("apellidos"));
					cli.setDomicilio(rs.getString("domicilio"));
					cli.setFacturacionAnual(rs.getFloat("facturacion_anual"));
					cli.setNumeroEmpleados(rs.getInt("numero_empleados"));
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return cli;
		}
		
	/**
	 * Método que elimina un cliente de la BBDD.
	 *
	 * @param Cliente
	 * @return  int  Si se elimina el cliente devuleve 1, si no, 0;
	 * @since 1.0
	 */
	@Override
	public int eliminarCliente(String cif) {
		sql = "DELETE FROM CLIENTES WHERE cif = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cif);
			filas = ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}

	/**
	 * Método que devuelve la lista completa de clientesd e la BBDD.
	 * 
	 * @return List
	 * @since 1.0
	 */
	@Override
	public List<Cliente> buscarTodos() {
		sql = "SELECT * FROM CLIENTES";
		List<Cliente> clientes = new ArrayList<>();
		try {
				ps = conn.prepareStatement(sql);
				rs= ps.executeQuery();
				while (rs.next()) {
					Cliente cli = new Cliente();
					cli = new Cliente();
					cli.setCif(rs.getString("cif"));
					cli.setNombre(rs.getString("nombre"));
					cli.setApellidos(rs.getString("apellidos"));
					cli.setDomicilio(rs.getString("domicilio"));
					cli.setFacturacionAnual(rs.getFloat("facturacion_anual"));
					cli.setNumeroEmpleados(rs.getInt("numero_empleados"));
					clientes.add(cli);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
		}

}

