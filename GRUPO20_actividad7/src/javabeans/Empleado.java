package javabeans;

import java.sql.Date;

///////////////////////////////////////////////////////////////////////////////////////////////////////////
//DEFINICIÓN DE CLASE
///////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
* 
* Esta es la clase 'Empleado',
* requerida en la actividad 7 de programacion DAW EDIX23.                                       
* 
* @author JulianMendezEdix
* @version 1.0
* 
*/
public class Empleado {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ATRIBUTOS PRIVADOS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private int idEmpl;
	private String nombre, apellidos, email;
	private String genero;
	private String password;
	private float salario;
	private Date fechaIngreso, fechaNacimiento;
	private Perfil perfil;
	private Departamento departamento;
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS CONSTRUCTORES
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Empleado() {
		super();
	}
	
	public Empleado(int idEmpl, String nombre, String apellidos, String email, String genero, String password,
			float salario, Date fechaIngreso, Date fechaNacimiento, Perfil perfil, Departamento departamento) {
		super();
		this.idEmpl = idEmpl;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.genero = genero;
		this.password = password;
		this.salario = salario;
		this.fechaIngreso = fechaIngreso;
		this.fechaNacimiento = fechaNacimiento;
		this.perfil = perfil;
		this.departamento = departamento;
	}



	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// GETTERS AND SETTERS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public int getIdEmpl() {
		return idEmpl;
	}

	public void setIdEmpl(int idEmpl) {
		this.idEmpl = idEmpl;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// REDEFINIR EQUALS Y HASHCODE
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fechaIngreso == null) ? 0 : fechaIngreso.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + idEmpl;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		result = prime * result + Float.floatToIntBits(salario);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fechaIngreso == null) {
			if (other.fechaIngreso != null)
				return false;
		} else if (!fechaIngreso.equals(other.fechaIngreso))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (idEmpl != other.idEmpl)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		if (Float.floatToIntBits(salario) != Float.floatToIntBits(other.salario))
			return false;
		return true;
	}


	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// REDEFINIR TOSTRING
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@Override
	public String toString() {
		return "Empleado [idEmpl=" + idEmpl + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email
				+ ", genero=" + genero + ", password=" + password + ", salario=" + salario + ", fechaIngreso="
				+ fechaIngreso + ", fechaNacimiento=" + fechaNacimiento + ", perfil=" + perfil + ", departamento="
				+ departamento + "]";
	}

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS PROPIOS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	


	public double salarioBruto () {
		return (this.salario);
	} 
	

	public double salarioMensual (int meses) {
		return (salario/meses);
	}
	

	public String literalSexo () {
		if (this.genero=="H")
			return "Hombre";
		else
			return "Mujer";
	}
	
	public  String obtenerEmail () {
		
		char inicial;
		inicial = (this.nombre.charAt(0));
		return (inicial + this.apellidos.split(" ")[0]).toLowerCase();	}



	public String nombreCompleto () {
		return ( this.nombre +" " +  this.apellidos );
	}

	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//FIN DE CLASE
///////////////////////////////////////////////////////////////////////////////////////////////////////////


}
