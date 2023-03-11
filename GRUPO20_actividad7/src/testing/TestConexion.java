package testing;

import daos.ClienteDao;
import daos.ClienteDaoImplMy8;

/**
 * 
 * Esta es la clase testing 'TestConexion', de la
 * actividad 7 de programacion DAW EDIX23.          
 * 
 * En ella probamos la funcionalidad de la conexion con la BBDD de MySQL8
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class TestConexion {

	public static void main(String[] args) {
		ClienteDao cdao = new ClienteDaoImplMy8();
		System.out.println(cdao.buscarTodos());
	}
	
}
		


















		/*String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		sql = "SELECT * FROM CLIENTES";
		List<Cliente> clientes = new ArrayList<>() ;
		try {
			//con prepareStatement mandamos la sentencia SQL al motor de BBDD.
			ps = conn.prepareStatement(sql);
			//con executeQuery sacamos los datos del motor  y creamos un fichero con una dirección 
			// ( y la dirección se la asignamos a rs, el puntero).
			rs = ps.executeQuery();
			// Rs.next recupera la información. Va a a la dirección: si hay fila devuelve true, sino FALSE. Lo 
			// hace fila a fila si hay varias filas.
			while (rs.next()) {
				Cliente cliente1 = new Cliente();
				cliente1.setCif(rs.getString(1));
				cliente1.setNombre(rs.getString(2));
				cliente1.setApellidos(rs.getString(3));
				cliente1.setDomicilio(rs.getString(4));
				cliente1.setFacturacionAnual(rs.getInt(5));
				cliente1.setNumeroEmpleados(rs.getInt(6));
				clientes.add(cliente1);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (Cliente ele: clientes) 
			System.out.println(ele);
	}*/



//ESTO ES PARA EL BUSCAR UNO; revisar clase
/*if (rs.next()) {
cliente = new Cliente();
cliente.setCif(rs.getString(1));
cliente.setCif(rs.getString("cif"));	
}*/
