package javabeans;

import java.sql.Date;

///////////////////////////////////////////////////////////////////////////////////////////////////////////
//DEFINICIÓN DE CLASE
///////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
* 
* Esta es la clase 'ProyectoConEmpleado',
* requerida en la actividad 7 de programacion DAW EDIX23.                                       
* 
* @author JulianMendezEdix
* @version 1.0
* 
*/
public class ProyectoConEmpleado {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ATRIBUTOS PRIVADOS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	private int numeroOrden;
	private Proyecto proyecto;
	private Empleado empleado;
	private int horasAsignadas;
	private Date fechaIncorporacion;
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS CONSTRUCTORES
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public ProyectoConEmpleado() {
		super();
	}

	public ProyectoConEmpleado(int numeroOrden, Proyecto proyecto, Empleado empleado, 
			int horasAsignadas, Date fechaIncorporacion) {
		super();
		this.numeroOrden = numeroOrden;
		this.proyecto = proyecto;
		this.empleado = empleado;
		this.horasAsignadas = horasAsignadas;
		this.fechaIncorporacion = fechaIncorporacion;
	}

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// GETTERS AND SETTERS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public int getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public int getHorasAsignadas() {
		return horasAsignadas;
	}

	public void setHorasAsignadas(int horasAsignadas) {
		this.horasAsignadas = horasAsignadas;
	}

	public Date getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(Date fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// REDEFINIR EQUALS Y HASHCODE
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empleado == null) ? 0 : empleado.hashCode());
		result = prime * result + ((fechaIncorporacion == null) ? 0 : fechaIncorporacion.hashCode());
		result = prime * result + horasAsignadas;
		result = prime * result + numeroOrden;
		result = prime * result + ((proyecto == null) ? 0 : proyecto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ProyectoConEmpleado))
			return false;
		ProyectoConEmpleado other = (ProyectoConEmpleado) obj;
		if (empleado == null) {
			if (other.empleado != null)
				return false;
		} else if (!empleado.equals(other.empleado))
			return false;
		if (fechaIncorporacion == null) {
			if (other.fechaIncorporacion != null)
				return false;
		} else if (!fechaIncorporacion.equals(other.fechaIncorporacion))
			return false;
		if (horasAsignadas != other.horasAsignadas)
			return false;
		if (numeroOrden != other.numeroOrden)
			return false;
		if (proyecto == null) {
			if (other.proyecto != null)
				return false;
		} else if (!proyecto.equals(other.proyecto))
			return false;
		return true;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// REDEFINIR TOSTRING
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@Override
	public String toString() {
		return "ProyectoConEmpleado [numeroOrden=" + numeroOrden + ", proyecto=" + proyecto + ", empleado=" + empleado
				+ ", horasAsignadas=" + horasAsignadas + ", fechaIncorporacion=" + fechaIncorporacion + "]";
	}
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS PROPIOS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public double costeHorasAsignadas() {
		double x = 0;
		x = (empleado.getPerfil().getPrecioHora())*horasAsignadas;
		return x;	
	}
	
	
	

	
	
	
}
