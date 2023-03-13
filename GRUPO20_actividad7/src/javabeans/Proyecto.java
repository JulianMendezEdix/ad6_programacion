package javabeans;

import java.sql.Date;

///////////////////////////////////////////////////////////////////////////////////////////////////////////
//DEFINICIÓN DE CLASE
///////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
* 
* Esta es la clase 'Proyecto',
* requerida en la actividad 7 de programacion DAW EDIX23.                                       
* 
* @author JulianMendezEdix
* @version 1.0
* 
*/
public class Proyecto {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ATRIBUTOS PRIVADOS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private String idProyecto, descripcion;
	private Date fechaInicio, fechaFinPrevisto, fechaFinReal;
	private double ventaPrevisto, costesPrevisto, costeReal;
	private String estado;
	private Empleado jefeProyecto;
	private Cliente cliente;

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS CONSTRUCTORES
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Proyecto() {
		super();
	}

	public Proyecto(String idProyecto, String descripcion, Date fechaInicio, Date fechaFinPrevisto, Date fechaFinReal,
			double ventaPrevisto, double costesPrevisto, double costeReal, String estado, Empleado jefeProyecto,
			Cliente cliente) {
		super();
		this.idProyecto = idProyecto;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinPrevisto = fechaFinPrevisto;
		this.fechaFinReal = fechaFinReal;
		this.ventaPrevisto = ventaPrevisto;
		this.costesPrevisto = costesPrevisto;
		this.costeReal = costeReal;
		this.estado = estado;
		this.jefeProyecto = jefeProyecto;
		this.cliente = cliente;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// GETTERS AND SETTERS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public String getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinPrevisto() {
		return fechaFinPrevisto;
	}

	public void setFechaFinPrevisto(Date fechaFinPrevisto) {
		this.fechaFinPrevisto = fechaFinPrevisto;
	}

	public Date getFechaFinReal() {
		return fechaFinReal;
	}

	public void setFechaFinReal(Date fechaFinReal) {
		this.fechaFinReal = fechaFinReal;
	}

	public double getVentaPrevisto() {
		return ventaPrevisto;
	}

	public void setVentaPrevisto(double ventaPrevisto) {
		this.ventaPrevisto = ventaPrevisto;
	}

	public double getCostesPrevisto() {
		return costesPrevisto;
	}

	public void setCostesPrevisto(double costesPrevisto) {
		this.costesPrevisto = costesPrevisto;
	}

	public double getCosteReal() {
		return costeReal;
	}

	public void setCosteReal(double costeReal) {
		this.costeReal = costeReal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Empleado getJefeProyecto() {
		return jefeProyecto;
	}

	public void setJefeProyecto(Empleado jefeProyecto) {
		this.jefeProyecto = jefeProyecto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// REDEFINIR EQUALS Y HASHCODE
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		long temp;
		temp = Double.doubleToLongBits(costeReal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(costesPrevisto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fechaFinPrevisto == null) ? 0 : fechaFinPrevisto.hashCode());
		result = prime * result + ((fechaFinReal == null) ? 0 : fechaFinReal.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((idProyecto == null) ? 0 : idProyecto.hashCode());
		result = prime * result + ((jefeProyecto == null) ? 0 : jefeProyecto.hashCode());
		temp = Double.doubleToLongBits(ventaPrevisto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Proyecto))
			return false;
		Proyecto other = (Proyecto) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (Double.doubleToLongBits(costeReal) != Double.doubleToLongBits(other.costeReal))
			return false;
		if (Double.doubleToLongBits(costesPrevisto) != Double.doubleToLongBits(other.costesPrevisto))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fechaFinPrevisto == null) {
			if (other.fechaFinPrevisto != null)
				return false;
		} else if (!fechaFinPrevisto.equals(other.fechaFinPrevisto))
			return false;
		if (fechaFinReal == null) {
			if (other.fechaFinReal != null)
				return false;
		} else if (!fechaFinReal.equals(other.fechaFinReal))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		if (idProyecto == null) {
			if (other.idProyecto != null)
				return false;
		} else if (!idProyecto.equals(other.idProyecto))
			return false;
		if (jefeProyecto == null) {
			if (other.jefeProyecto != null)
				return false;
		} else if (!jefeProyecto.equals(other.jefeProyecto))
			return false;
		if (Double.doubleToLongBits(ventaPrevisto) != Double.doubleToLongBits(other.ventaPrevisto))
			return false;
		return true;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// REDEFINIR TOSTRING
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@Override
	public String toString() {
		return "Proyecto [idProyecto=" + idProyecto + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio
				+ ", fechaFinPrevisto=" + fechaFinPrevisto + ", fechaFinReal=" + fechaFinReal + ", ventaPrevisto="
				+ ventaPrevisto + ", costesPrevisto=" + costesPrevisto + ", costeReal=" + costeReal + ", estado="
				+ estado + ", jefeProyecto=" + jefeProyecto + ", cliente=" + cliente + "]";
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS PROPIOS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	
	public double margenPrevisto() {
		double x = 0;
		x= this.ventaPrevisto-this.costesPrevisto;
		return x;
	}
	
	public double margenReal() {
		double x = 0;
		x= this.ventaPrevisto-this.costeReal;
		return x;
	}
	
	public double diferenciaGastos() {
		double x = 0;
		x= this.costeReal - this.costesPrevisto;
		return x;
	}
	
	public int diferenciaFinPrevistoReal() {
		int x = 300;
		// tengo que estudiarme movidas con fechas!!!! :)
		return x;
	}
	
	
	

	
	
	
	
	
	
	

}
