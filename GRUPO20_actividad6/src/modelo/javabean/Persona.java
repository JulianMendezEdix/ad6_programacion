package modelo.javabean;

/**
 * 
 * Esta es la clase abstracta Persona requerida en la 
 * actividad 6 de programacion DAW EDIX23.                                       
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public abstract class Persona {
	
	// ATRIBUTOS
	
	protected String nif, nombre, direccion, telefono;

	// MÉTODOS CONSTRUCTORES
	
	public Persona() {
		super();
	}

	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	//GETTERS AND SETTERS
	
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	// MÉTODO toString() redefinido.
	
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + 
					", telefono=" + telefono + "]";
	}
	
	//MÉTODOS
	
	/**
	 * El método devuelve una cadena con la informacion <br>
	 * de quien llama a quien.
	 * 
	 * @param p String del nombre de persona a la que se llama
	 * @return String: Una cadena similar a esta: 
	 * “Alicia Torres llamando a Carlos Robles”
	 */
	public String llamar(Persona p) {
		return (this.nombre + " llamando a " + p.nombre);		
	};
	
	/**
	 * Método abstracto de la clase abstracta Persona.
	 */
	public abstract String  trabajar();
	
	
	
}
