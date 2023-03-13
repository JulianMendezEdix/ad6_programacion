package daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.AbstractConexionDaoMy8;
import javabeans.Empleado;

public class EmpleadoDaoImplMy8 extends AbstractConexionDaoMy8 implements EmpleadoDao  {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS DE IMPLEMENTACIÓN
	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * Notas: He estado probando el autoincremental sin resultados satisfactorios, horas despues, me he 
	 * dado cuenta que las inserciones en la tabla empleados se hicieron añdiendo las primary keys de
	 *  manera "estandar", sin autoincremental. Así que lo solucioné así tambien.
	 */
	@Override
	public int altaEmpleado(Empleado empleado) {
		sql = "INSERT INTO EMPLEADOS VALUES(?,?,?,?,?,?,?,?,?,?,?);";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, empleado.getIdEmpl());
			ps.setString(2, empleado.getNombre());
			ps.setString(3, empleado.getApellidos());;
			ps.setString(4, String.valueOf(empleado.getGenero()));
			ps.setString(5, empleado.getEmail());
			ps.setString(6, empleado.getPassword());
			ps.setFloat(7, empleado.getSalario());
			ps.setDate(8, empleado.getFechaIngreso());
			ps.setDate(9, empleado.getFechaNacimiento());
			ps.setInt(10,empleado.getPerfil().getIdPerfil());
			ps.setInt(11, empleado.getDepartamento().getIdDepar());
			filas = ps.executeUpdate();
			//filas=1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int eliminarEmpleado(int idEmpl) {
		sql = "DELETE FROM EMPLEADOS WHERE id_empl = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idEmpl);
			filas = ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Empleado buscarEmpleado(int idEmpl) {
		sql = "SELECT * FROM EMPLEADOS WHERE id_empl = ?";
		Empleado emp = null;
		try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, idEmpl);
				rs= ps.executeQuery();
				if (rs.next()) {
					emp = new Empleado();
					PerfilDao pdao = new PerfilDaoImplMy8();
					DepartamentoDao ddao = new DepartamentoDaoImplMy8();
					emp.setIdEmpl(rs.getInt("id_empl"));
					emp.setNombre(rs.getString("nombre"));
					emp.setApellidos(rs.getString("apellidos"));
					emp.setGenero(rs.getString("genero"));
					emp.setEmail(rs.getString("email"));
					emp.setPassword(rs.getString("password"));
					emp.setSalario(rs.getFloat("salario"));
					emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
					emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
					emp.setPerfil(pdao.buscarPerfil(rs.getInt("id_perfil")));
					emp.setDepartamento(ddao.buscarDepartamento(rs.getInt("id_depar")));
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Empleado> buscarTodos() {
		sql = "SELECT * FROM EMPLEADOS";
		List<Empleado> empleados = new ArrayList<>();
		PerfilDao pdao = new PerfilDaoImplMy8();
		DepartamentoDao ddao = new DepartamentoDaoImplMy8();
		try {
				ps = conn.prepareStatement(sql);
				rs= ps.executeQuery();
				while (rs.next()) {
					Empleado emp = new Empleado();
					emp.setIdEmpl(rs.getInt("id_empl"));
					emp.setNombre(rs.getString("nombre"));
					emp.setApellidos(rs.getString("apellidos"));
					emp.setGenero(rs.getString("genero"));
					emp.setEmail(rs.getString("email"));
					emp.setPassword(rs.getString("password"));
					emp.setSalario(rs.getFloat("salario"));
					emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
					emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
					emp.setPerfil(pdao.buscarPerfil(rs.getInt("id_perfil")));
					emp.setDepartamento(ddao.buscarDepartamento(rs.getInt("id_depar")));
					empleados.add(emp);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return empleados;
	}

	@Override
	public List<Empleado> empleadosByDepartamento(int idDepar) {
		sql = "SELECT * FROM EMPLEADOS WHERE id_depar = ? ";
		List<Empleado> empleados = new ArrayList<>();
		PerfilDao pdao = new PerfilDaoImplMy8();
		DepartamentoDao ddao = new DepartamentoDaoImplMy8();
		try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, idDepar);
				rs= ps.executeQuery();
				while (rs.next()) {
					Empleado emp = new Empleado();
					emp.setIdEmpl(rs.getInt("id_empl"));
					emp.setNombre(rs.getString("nombre"));
					emp.setApellidos(rs.getString("apellidos"));
					emp.setGenero(rs.getString("genero"));
					emp.setEmail(rs.getString("email"));
					emp.setPassword(rs.getString("password"));
					emp.setSalario(rs.getFloat("salario"));
					emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
					emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
					emp.setPerfil(pdao.buscarPerfil(rs.getInt("id_perfil")));
					emp.setDepartamento(ddao.buscarDepartamento(rs.getInt("id_depar")));
					empleados.add(emp);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return empleados;
	}

	@Override
	public List<Empleado> empleadosByGenero(String genero) {
		sql = "SELECT * FROM EMPLEADOS WHERE genero = ? ";
		List<Empleado> empleados = new ArrayList<>();
		PerfilDao pdao = new PerfilDaoImplMy8();
		DepartamentoDao ddao = new DepartamentoDaoImplMy8();
		try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, genero);
				rs= ps.executeQuery();
				while (rs.next()) {
					Empleado emp = new Empleado();
					emp.setIdEmpl(rs.getInt("id_empl"));
					emp.setNombre(rs.getString("nombre"));
					emp.setApellidos(rs.getString("apellidos"));
					emp.setGenero(rs.getString("genero"));
					emp.setEmail(rs.getString("email"));
					emp.setPassword(rs.getString("password"));
					emp.setSalario(rs.getFloat("salario"));
					emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
					emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
					emp.setPerfil(pdao.buscarPerfil(rs.getInt("id_perfil")));
					emp.setDepartamento(ddao.buscarDepartamento(rs.getInt("id_depar")));
					empleados.add(emp);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return empleados;
	}

	@Override
	public List<Empleado> empleadosByApellido(String subcadena) {
		sql = "SELECT * FROM EMPLEADOS WHERE apellidos LIKE ? ";
		List<Empleado> empleados = new ArrayList<>();
		PerfilDao pdao = new PerfilDaoImplMy8();
		DepartamentoDao ddao = new DepartamentoDaoImplMy8();
		try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, "%" + subcadena + "%");
				rs= ps.executeQuery();
				while (rs.next()) {
					Empleado emp = new Empleado();
					emp.setIdEmpl(rs.getInt("id_empl"));
					emp.setNombre(rs.getString("nombre"));
					emp.setApellidos(rs.getString("apellidos"));
					emp.setGenero(rs.getString("genero"));
					emp.setEmail(rs.getString("email"));
					emp.setPassword(rs.getString("password"));
					emp.setSalario(rs.getFloat("salario"));
					emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
					emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
					emp.setPerfil(pdao.buscarPerfil(rs.getInt("id_perfil")));
					emp.setDepartamento(ddao.buscarDepartamento(rs.getInt("id_depar")));
					empleados.add(emp);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return empleados;
	}

	@Override
	public double salarioTotal() {
		sql = "SELECT SUM(salario) FROM EMPLEADOS";
		double x = 0;
		try {
			ps = conn.prepareStatement(sql);
			rs= ps.executeQuery();
			while (rs.next()) {
				x = rs.getDouble("sum(salario)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public double salarioByDepartamento(int idDepar) {
		sql = "SELECT SUM(salario) FROM EMPLEADOS WHERE id_depar = ?";
		double x = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idDepar);
			rs= ps.executeQuery();
			while (rs.next()) {
				x = rs.getDouble("sum(salario)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}
	
	

}
