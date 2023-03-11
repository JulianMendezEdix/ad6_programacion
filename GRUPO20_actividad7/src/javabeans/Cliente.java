package javabeans;

///////////////////////////////////////////////////////////////////////////////////////////////////////////
// DEFINICIÓN DE CLASE
///////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Esta es la clase 'Cliente',
 * requerida en la actividad 7 de programacion DAW EDIX23.                                       
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public class Cliente {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ATRIBUTOS PRIVADOS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private String cif, nombre, apellidos, domicilio;
	private float facturacionAnual;
	private int numeroEmpleados;

	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS CONSTRUCTORES
	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	public Cliente() {
		super();
	}
	
	public Cliente(String cif, String nombre, String apellidos, String domicilio, float facturacionAnual,
			int numeroEmpleados) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.facturacionAnual = facturacionAnual;
		this.numeroEmpleados = numeroEmpleados;
	}


	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// GETTERS AND SETTERS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public float getFacturacionAnual() {
		return facturacionAnual;
	}

	public void setFacturacionAnual(float facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}

	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// REDEFINIR EQUALS Y HASHCODE
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cif == null) ? 0 : cif.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		if (cif == null) {
			if (other.cif != null)
				return false;
		} else if (!cif.equals(other.cif))
			return false;
		return true;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// REDEFINIR TOSTRING
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@Override
	public String toString() {
		return "Cliente [cif=" + cif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" 
				+ domicilio + ", facturacionAnual=" + facturacionAnual + ", numeroEmpleados=" + 
				numeroEmpleados + "]";
	}
	
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
// FIN DE CLASE
///////////////////////////////////////////////////////////////////////////////////////////////////////////
