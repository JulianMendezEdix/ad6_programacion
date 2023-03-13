package daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.AbstractConexionDaoMy8;
import javabeans.ProyectoConEmpleado;

public class ProyectoConEmpleadoDaoImplMy8 extends AbstractConexionDaoMy8 
	implements ProyectoConEmpleadoDao {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS DE IMPLEMENTACIÓN
	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public List<ProyectoConEmpleado> empleadosByProyecto(String idProyecto) {
		sql = "SELECT * FROM PROYECTO_CON_EMPLEADOS WHERE id_proyecto = ? ";
		List<ProyectoConEmpleado> proyectoConEmpleados= new ArrayList<>();
		ProyectoDao pdao = new ProyectoDaoImplMy8();
		try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, idProyecto);
				rs= ps.executeQuery();
				while (rs.next()) {
					ProyectoConEmpleado pce = new ProyectoConEmpleado();
					EmpleadoDao edao = new EmpleadoDaoImplMy8();
					pce.setNumeroOrden(rs.getInt("numero_orden"));
					pce.setProyecto(pdao.buscarProyecto(rs.getString("id_proyecto")));
					pce.setEmpleado(edao.buscarEmpleado(rs.getInt("id_empl")));
					pce.setHorasAsignadas(rs.getInt("horas_asignadas"));
					pce.setFechaIncorporacion(rs.getDate("fecha_incorporacion"));
					proyectoConEmpleados.add(pce);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return proyectoConEmpleados;
	}

	@Override
	public int asignarEmpleadosAProyecto(List<ProyectoConEmpleado> empleados) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int horasAsignadasAProyecto(String idProyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double costeActualDeProyecto(String idProyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double margenActualProyecto(String idProyecto) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	