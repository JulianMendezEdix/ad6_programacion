package modelo.javabean;

/**
 * 
 * Esta es la clase 'Administrativo' hija de la clase 'Persona', 
 * requerida en la actividad 6 de programacion DAW EDIX23.                                       
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class Administrativo extends Persona {
	
	// ATRIBUTOS
	
	private String tareas;
	
	// MÉTODOS CONSTRUCTORES

	public Administrativo() {
		super();
	}

	public Administrativo(String nif, String nombre, String direccion, String telefono, 
			String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}
	
	
	// GETTERS AND SETTER

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
	// MÉTODO toString() redefinido

	@Override
	public String toString() {
		return "Administrativo [nif=" + nif + ", nombre=" + nombre + ", direccion=" + 
				direccion + ", telefono=" + telefono + ", tareas=" + tareas + "]";
	}
	
	// MÉTODO trabajar() heredado redefinido
	
	/**
	 * Método heredado de la clase abstracta 'Persona'<br>
	 * que devuelve un String con la información de que <br> 
	 * el administrativo  X va a realizar unas tareas.
	 * 
	 * @returns String "El administrativo X va a realizar estas tareas..."
	 * 
	 */
	@Override
	public String trabajar() {
		return ("El administrativo " + nombre + " va a realizar estas tareas: " + tareas);
	}
	
	/**
	 * El método devuelve un String con la información<br>
	 * de que X administrativo  va a gestionar una matrícula.
	 * 
	 * @return String "El administrativo X va a gestionar...""
	 */
	public String gestionarMatricula() {
		return ("El administrativo " + nombre + " va a gestionar una matrícula");
	};
	

	
	
	

	
	

	
	
	
	

	
	
		

}
