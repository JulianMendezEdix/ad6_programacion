package javabeans;


///////////////////////////////////////////////////////////////////////////////////////////////////////////
//DEFINICIÓN DE CLASE
///////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
* 
* Esta es la clase 'Perfil',
* requerida en la actividad 7 de programacion DAW EDIX23.                                       
* 
* @author JulianMendezEdix
* @version 1.0
* 
*/
public class Perfil {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ATRIBUTOS PRIVADOS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private int idPerfil;
	private String nombre;
	private double precioHora;
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS CONSTRUCTORES
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Perfil() {
		super();
	}

	public Perfil(int idPerfil, String nombre, double precioHora) {
		super();
		this.idPerfil = idPerfil;
		this.nombre = nombre;
		this.precioHora = precioHora;
	}


	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// GETTERS AND SETTERS
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	
	

	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// REDEFINIR EQUALS Y HASHCODE
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPerfil;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Perfil))
			return false;
		Perfil other = (Perfil) obj;
		if (idPerfil != other.idPerfil)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// REDEFINIR TOSTRING
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nombre=" + nombre + "]";
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//FIN DE CLASE
///////////////////////////////////////////////////////////////////////////////////////////////////////////


}