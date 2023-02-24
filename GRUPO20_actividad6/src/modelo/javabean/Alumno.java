package modelo.javabean;

/**
 * 
 * Esta es la clase 'Alumno' hija de la clase 'Persona', 
 * requerida en la actividad 6 de programacion DAW EDIX23.                                       
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class Alumno extends Persona {
	
	// ATRIBUTOS
	
	private String curso;
	
	// METODOS CONSTRUCTOR
	
	public Alumno() {
		super();
	}

	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}
	
	// GETTERS AND SETTER

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	// MÉTODO toString() redefinido
	
	@Override
	public String toString() {
		return "Alumno [getNif()=" + getNif() + ", getNombre()=" + getNombre() + 
				", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + 
				", curso=" + curso + "]";
	}

	// MÉTODO trabajar() redefinido

	/**
	 * Método heredado de la clase abstracta 'Persona'<br>
	 * que devuelve un String con la información de que <br> 
	 * el alumno X va a estudiar para el curso Y.
	 * 
	 * @returns String "El alumno X va a estudiar para el curso Y"
	 * 
	 */
	@Override
	public String trabajar() {
		return ("El alumno " + getNombre() + " va a estudiar para el curso " + curso  );
	}
	
	// MÉTODOS
	
	/**
	 * El método devuelve un String con la información<br>
	 * de que X alumno  va a hacer su examen.
	 * 
	 * @return String "El alumno X va a hacer su examen"
	 */
	public String hacerExamen () {
		return ("El alumno " + getNombre() + " va a hacer su examen");
	};
	

}
