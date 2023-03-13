package daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.AbstractConexionDaoMy8;
import javabeans.Proyecto;

public class ProyectoDaoImplMy8 extends AbstractConexionDaoMy8 implements ProyectoDao {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS DE IMPLEMENTACIÓN
	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public int altaProyecto(Proyecto proyecto) {
		sql = "INSERT INTO PROYECTOS VALUES(?,?,?,?,?,?,?,?,?,?,?);";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, proyecto.getIdProyecto());
			ps.setString(2, proyecto.getDescripcion());
			ps.setDate(3, proyecto.getFechaInicio());;
			ps.setDate(4, proyecto.getFechaFinPrevisto());
			ps.setDate(5, proyecto.getFechaFinReal());
			ps.setDouble(6, proyecto.getVentaPrevisto());
			ps.setDouble(7, proyecto.getCostesPrevisto());
			ps.setDouble(8, proyecto.getCosteReal());
			ps.setString(9, proyecto.getEstado());
			ps.setInt(10, proyecto.getJefeProyecto().getIdEmpl());
			ps.setString(11, proyecto.getCliente().getCif());
			filas = ps.executeUpdate();
			//filas=1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int eliminarProyecto(String idProyecto) {
		sql = "DELETE FROM PROYECTOS WHERE id_proyecto = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, idProyecto);
			filas = ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Proyecto buscarProyecto(String idProyecto) {
		sql = "SELECT * FROM PROYECTOS WHERE id_proyecto = ?";
		Proyecto pro = null;
		try {
				ps = conn.prepareStatement(sql);
				ps.setString(1,  idProyecto);
				rs= ps.executeQuery();
				if (rs.next()) {
					pro = new Proyecto();
					EmpleadoDao edao = new EmpleadoDaoImplMy8();
					ClienteDao cdao = new ClienteDaoImplMy8();
					pro.setIdProyecto(rs.getString("id_proyecto"));
					pro.setDescripcion(rs.getString("descripcion"));
					pro.setFechaInicio(rs.getDate("fecha_inicio"));
					pro.setFechaFinPrevisto(rs.getDate("fecha_fin_previsto"));
					pro.setFechaFinReal(rs.getDate("fecha_fin_real"));
					pro.setVentaPrevisto(rs.getDouble("venta_previsto"));
					pro.setCostesPrevisto(rs.getDouble("costes_previsto"));
					pro.setCosteReal(rs.getDouble("coste_real"));
					pro.setEstado(rs.getString("estado"));
					pro.setJefeProyecto(edao.buscarEmpleado(rs.getInt("jefe_proyecto")));
					pro.setCliente(cdao.buscarCliente(rs.getString("cif")));
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return pro;
	}

	@Override
	public List<Proyecto> buscarTodos() {
		sql = "SELECT * FROM PROYECTOS";
		List<Proyecto> proyectos = new ArrayList<>();
		Proyecto pro = null;
		try {
				ps = conn.prepareStatement(sql);
				rs= ps.executeQuery();
				while (rs.next()) {
					pro = new Proyecto();
					EmpleadoDao edao = new EmpleadoDaoImplMy8();
					ClienteDao cdao = new ClienteDaoImplMy8();
					pro.setIdProyecto(rs.getString("id_proyecto"));
					pro.setDescripcion(rs.getString("descripcion"));
					pro.setFechaInicio(rs.getDate("fecha_inicio"));
					pro.setFechaFinPrevisto(rs.getDate("fecha_fin_previsto"));
					pro.setFechaFinReal(rs.getDate("fecha_fin_real"));
					pro.setVentaPrevisto(rs.getDouble("venta_previsto"));
					pro.setCostesPrevisto(rs.getDouble("costes_previsto"));
					pro.setCosteReal(rs.getDouble("coste_real"));
					pro.setEstado(rs.getString("estado"));
					pro.setJefeProyecto(edao.buscarEmpleado(rs.getInt("jefe_proyecto")));
					pro.setCliente(cdao.buscarCliente(rs.getString("cif")));
					proyectos.add(pro);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return proyectos;
	}

	@Override
	public List<Proyecto> proyectosByEstado(String estado) {
		sql = "SELECT * FROM PROYECTOS WHERE estado = ?";
		List<Proyecto> proyectos = new ArrayList<>();
		Proyecto pro = null;
		try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, estado);
				rs= ps.executeQuery();
				while (rs.next()) {
					pro = new Proyecto();
					EmpleadoDao edao = new EmpleadoDaoImplMy8();
					ClienteDao cdao = new ClienteDaoImplMy8();
					pro.setIdProyecto(rs.getString("id_proyecto"));
					pro.setDescripcion(rs.getString("descripcion"));
					pro.setFechaInicio(rs.getDate("fecha_inicio"));
					pro.setFechaFinPrevisto(rs.getDate("fecha_fin_previsto"));
					pro.setFechaFinReal(rs.getDate("fecha_fin_real"));
					pro.setVentaPrevisto(rs.getDouble("venta_previsto"));
					pro.setCostesPrevisto(rs.getDouble("costes_previsto"));
					pro.setCosteReal(rs.getDouble("coste_real"));
					pro.setEstado(rs.getString("estado"));
					pro.setJefeProyecto(edao.buscarEmpleado(rs.getInt("jefe_proyecto")));
					pro.setCliente(cdao.buscarCliente(rs.getString("cif")));
					proyectos.add(pro);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return proyectos;
	}

	@Override
	public List<Proyecto> proyectosByCliente(String cif) {
		sql = "SELECT * FROM PROYECTOS WHERE cif = ?";
		List<Proyecto> proyectos = new ArrayList<>();
		Proyecto pro = null;
		try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, cif);
				rs= ps.executeQuery();
				while (rs.next()) {
					pro = new Proyecto();
					EmpleadoDao edao = new EmpleadoDaoImplMy8();
					ClienteDao cdao = new ClienteDaoImplMy8();
					pro.setIdProyecto(rs.getString("id_proyecto"));
					pro.setDescripcion(rs.getString("descripcion"));
					pro.setFechaInicio(rs.getDate("fecha_inicio"));
					pro.setFechaFinPrevisto(rs.getDate("fecha_fin_previsto"));
					pro.setFechaFinReal(rs.getDate("fecha_fin_real"));
					pro.setVentaPrevisto(rs.getDouble("venta_previsto"));
					pro.setCostesPrevisto(rs.getDouble("costes_previsto"));
					pro.setCosteReal(rs.getDouble("coste_real"));
					pro.setEstado(rs.getString("estado"));
					pro.setJefeProyecto(edao.buscarEmpleado(rs.getInt("jefe_proyecto")));
					pro.setCliente(cdao.buscarCliente(rs.getString("cif")));
					proyectos.add(pro);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return proyectos;
	}

	@Override
	public List<Proyecto> proyectosByJefeProyectoAndByEstado(int jefeProyecto, String estado) {
		sql = "SELECT * FROM PROYECTOS WHERE (jefe_proyecto = ? AND estado = ?  )";
		List<Proyecto> proyectos = new ArrayList<>();
		Proyecto pro = null;
		try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, jefeProyecto);
				ps.setString(2, estado);
				rs= ps.executeQuery();
				while (rs.next()) {
					pro = new Proyecto();
					EmpleadoDao edao = new EmpleadoDaoImplMy8();
					ClienteDao cdao = new ClienteDaoImplMy8();
					pro.setIdProyecto(rs.getString("id_proyecto"));
					pro.setDescripcion(rs.getString("descripcion"));
					pro.setFechaInicio(rs.getDate("fecha_inicio"));
					pro.setFechaFinPrevisto(rs.getDate("fecha_fin_previsto"));
					pro.setFechaFinReal(rs.getDate("fecha_fin_real"));
					pro.setVentaPrevisto(rs.getDouble("venta_previsto"));
					pro.setCostesPrevisto(rs.getDouble("costes_previsto"));
					pro.setCosteReal(rs.getDouble("coste_real"));
					pro.setEstado(rs.getString("estado"));
					pro.setJefeProyecto(edao.buscarEmpleado(rs.getInt("jefe_proyecto")));
					pro.setCliente(cdao.buscarCliente(rs.getString("cif")));
					proyectos.add(pro);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return proyectos;
	}

	@Override
	public double importesVentaProyectosTerminados() {
		sql = "SELECT SUM(venta_previsto) FROM PROYECTOS WHERE estado = 'TERMINADO'";
		double x = 0;
		try {
			ps = conn.prepareStatement(sql);
			rs= ps.executeQuery();
			while (rs.next()) {
				x = rs.getDouble("sum(venta_previsto)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;

	}

	@Override
	public double margenBrutoProyectosTerminados() {
		sql = "SELECT (SUM(venta_previsto)-SUM(coste_real)) FROM PROYECTOS WHERE estado = "
				+ "'TERMINADO'";
		double x = 0;
		try {
			ps = conn.prepareStatement(sql);
			rs= ps.executeQuery();
			while (rs.next()) {
				x = rs.getDouble("(SUM(venta_previsto)-SUM(coste_real))");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public int diasATerminoProyectoActivo(String idProyecto) {
		sql = "SELECT DATEDIFF (current_date(), fecha_fin_previsto) FROM PROYECTOS WHERE "
				+ "id_proyecto = ?";
		int dias = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, idProyecto);
			rs = ps.executeQuery();
			if (rs.next()) {
				dias = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			}
		return dias;

	}

	
}