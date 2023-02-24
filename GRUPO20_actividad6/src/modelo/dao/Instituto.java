package modelo.dao;

import java.util.List;
import java.util.ArrayList;
import modelo.javabean.*;

/**
 * 
 * Esta es la clase 'Instituto' que implementa
 * el Interface 'InstitutoDao' requerida en la 
 * actividad 6 de programacion DAW EDIX23.                                       
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
public class Instituto implements InstitutoDao {
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	// ATRIBUTOS PRIVADOS
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	private ArrayList<Persona>personas;
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODO CONSTRUCTOR QUE CARGA DATOS
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	public Instituto () {
		personas = new ArrayList<>();	
		cargarDatos();
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	// GETTERS AND SETTERS
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}


	/////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS DE IMPLEMENTACIÓN
	/////////////////////////////////////////////////////////////////////////////////////////////
	

	/**
	 * 	
	 * Método de Implementación de la clase interface 'InstitutoDao"
	 * que da el alta de una persona en el ArrayList.
     * 
	 * Se incluye un FOR EACH con un IF para que cualquier persona sea única y 
	 * no pueda estar repetida.
	 * Se usa  el método add() de la clase ArrayList para agregar la persona.
	 * 
	 * @param persona Instancia de la clase 'Persona' que queremos añadir.
	 * @return boolean Si se añade la persona TRUE, si no, FALSE.
	 * 
	 */	
	@Override
	public boolean altaPersona(Persona persona) {
		 /* if (personas.contains(persona)) 
			return false;*/
			/*No me ha funcionado con el contains así que he trabajado en 
			 * una alternativa con un FOR EACH
			 */
		for (Persona ele: personas) {
			if (ele.getNif().equalsIgnoreCase(persona.getNif())) 
				return false;
		}	
			return personas.add(persona);
	}

	/*
	 * He probado a utilizar el truco de Tomás para evitar hacer un FOR en el método
	 * buscarPersona que viene a continuación utilizando el indexOf sin éxito.
	 * (siempre devolvía -1):
	@Override
	public Persona buscarPersona(String nif) {
		Persona alu = new Alumno();
		alu.setNif(nif);
		int posicion = personas.indexOf(alu);
		if (posicion == -1)
			return null;
		else ; 
			return personas.get(posicion);
	 }
	 * Así que he hecho un FOR EACH para recorrer el array e ir comparando elemento a
	 * elemento con equals().
	 */

	/**
	 * Método que busca y devuelve una persona en concreto<br>
	 * pasándole su NIF.
	 * 
	 * @param nif String con la "clave primaria" de la persona.
	 * @return Persona Devuelve la persona con el NIF que se le pase<br>
	 *   o NULL si no la encuentra.
	 *   
	 */
	@Override
	public Persona buscarPersona(String nif) {
		Persona aux = new Alumno();
		for (Persona ele: personas) {
			if (ele.getNif().equalsIgnoreCase(nif))
				return ele;
			}
		return null;		
	}

	/**
	 * Método que devuelve la lista completa de personas.
	 * 
	 * @return List
	 * @since 1.0
	 */
	@Override
	public List<Persona> buscarTodas() {
		return personas;
	}

	/**
	 * Método que elimina una entrada del arraylist
	 *
	 * @param Persona
	 * @return boolean
	 * @since 1.0
	 */
	@Override
	public boolean eliminarPersona(Persona persona) {
		// Usaremos el método remove de la clase ArrayList.
		return personas.remove(persona);
	}

	/**
	 * Método que busca personas por tipo: alumno, profesor <br>
	 * o administrativo.
	 *
	 * @param
	 * @return List
	 * @since 1.0
	 */
	@Override
	public List<Persona> buscarPersonaPorTipo(String tipoPersona) {
		
		List<Persona> aux = new ArrayList<>();
		
		switch (tipoPersona.toUpperCase()) {
		
			case "ALUMNO":
				for (Persona ele : personas) {
					if (ele instanceof Alumno)
						aux.add(ele);
				}
				break;
	
			case "PROFESOR":
				for (Persona ele : personas) {
					if (ele instanceof Profesor)
						aux.add(ele);
				}
				break;
	
			case "ADMINISTRATIVO":
				for (Persona ele : personas) {
					if (ele instanceof Administrativo)
						aux.add(ele);
				}
				break;
	
			default:
				System.out.println("No se ha encontrado ningún elemento");
				return aux;
			}
			return aux;
		}
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS PROPIOS
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Método para cargar por defecto una serie de <br>
	 * personas en un nuevo ArrayList de la clase Instituto.
	 * 
	 * @since 1.0
	 * 
	 */
	private void cargarDatos() {
		
		// Creación de alumnos
		
		personas.add(new Alumno("14628060A", "PAOLO FUTRE", "CALLE GATO 10", 
				"699030332", "1ºESO"));
		personas.add( new Alumno("14628061A", "FERNANDO TORRES", "CALLE PERRO 10", 
				"645565656", "2ºESO"));
		personas.add(new Alumno("14628062A", "KOKE RESURRECCION", "CALLE CULEBRA", 
				"645565656", "3ºESO"));
		
		// Creación de profesores
		
		personas.add(new Profesor("14628070B", "LUIS ARAGONES", "CALLE HORTALEZA", 
				"678454545", "MOTIVACION"));
		personas.add(new Profesor("14628071B", "RADOMIR ANTIC", "CALLE SERBIA 11", 
				"612343434", "BALON PARADO"));
		personas.add(new Profesor("14628070B", "DIEGO SIMEONE", "CALLE ARGENTINA", 
				"623676767", "DEFENDER Y SALIR"));
		
		// Creación de administrativos
		
		personas.add(new Administrativo("14628080C", "VICENTE CALDERON", 
				"PASEO DE LOS MELANCOLICOS", "678676767", "PRESIDIR"));
		personas.add(new Administrativo("14628081C", "JESUS GIL", 
				"CALLE MARBELLA 12", "678676723", "MONTAR YEGUAS"));
		personas.add(new Administrativo("14628082C", "ENRIQUE CEREZO", 
				"CALLE MARBELLA 12", "678676723", "PRODUCIR PELICULAS"));
		
	};
	
}
