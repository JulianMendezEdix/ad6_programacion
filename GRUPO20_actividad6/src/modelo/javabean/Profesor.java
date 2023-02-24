package modelo.javabean;

/**
 * 
 * Esta es la clase 'Profesor' hija de la clase 'Persona', 
 * requerida en la actividad 6 de programacion DAW EDIX23.                                       
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */

public class  Profesor extends Persona {
	
	// ATRIBUTOS
	
	private String competencias;
	
	
	// MÉTODOS CONSTRUCTORES

	public Profesor() {
		super();
	}

	public Profesor(String nif, String nombre, String direccion, String telefono, 
			String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}
	
	// GETTERS AND SETTERS

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	// MÉTODO toString() refdefinido
	
	@Override
	public String toString() {
		return "Profesor [getNif()=" + getNif() + ", getNombre()=" + getNombre() + 
				", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + 
				", competencias=" + competencias + "]";
	}

	// MÉTODO trabajar() refdefinido
	
	/**
	 * Método heredado de la clase abstracta 'Persona'<br>
	 * que devuelve un String con la información de que <br> 
	 * el profesor X va a impartir su clase.
	 * 
	 * @returns String "El profesro X va a impartir su clase"
	 * 
	 */
	@Override
	public String trabajar() {
		return ("El profesor " + getNombre() + " va a impartir su clase");
	}
	
	// MÉTODOS

	/**
	 * El método devuelve un String con la información<br>
	 * de que X profesor va a corregir los exámenes.
	 * 
	 * @return String "El profesor X va a corregir los exámenes".
	 */
	public String ponerNotas () {
		return ("El profesor " + getNombre() + " va a corregir los exámenes");
	};
	
}
