package testing;

import modelo.dao.*;
import modelo.javabean.*;

/**
 * 
 * Esta es la clase testing 'TestInstituto', de la
 * actividad 6 de programacion DAW EDIX23.          
 * 
 * En ella probamos la funcionalidad de los
 * métodos creados en los daos.
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class TestInstituto {
	
	public static void main(String[] args) {
		
		Instituto atleti = new Instituto();
		
		//////////////////////////////////////////////////////////////////////////////////////////
		//TEST buscarTodas()
		//////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Test BuscarTodas(): ");
		printPersonas(atleti);

		
		//////////////////////////////////////////////////////////////////////////////////////////
		//TESTS altaPersona()
		//////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Test altaPersona NIF nuevo (99999999A): ");
		Alumno alu = new Alumno("99999999A", "GRIEZMANN", "X", "X", "X");
		System.out.println(atleti.altaPersona(alu));
		printPersonas(atleti);
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Test altaPersona NIF existente (14628060A): ");
		Alumno alu2 = new Alumno("14628060A", "CAMINERO", "X", "X", "X");
		System.out.println(atleti.altaPersona(alu2));
		printPersonas(atleti);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		//TEST buscarPersona()
		//////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Test buscarPersona (99999999A): ");
		System.out.println(atleti.buscarPersona("99999999A"));
		System.out.println("");
		
		System.out.println("Test buscarPersona que no existe (00000000A): ");
		System.out.println(atleti.buscarPersona("00000000A"));
		System.out.println("");
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		//TEST eliminarPersona()
		//////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Test eliminarPersona (99999999A) GRIEZMANN): ");
		System.out.println(atleti.eliminarPersona(alu));
		printPersonas(atleti);
		System.out.println("-------------------------------------------------------------------");
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		//TESTS buscarPersonaPorTipo()
		//////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Test buscarPersonaPorTipo(alumno):");
		System.out.println("");
		for (Persona ele: atleti.buscarPersonaPorTipo("alumno")) {
			System.out.println(((Alumno)ele).hacerExamen());
			}
		System.out.println("");
		
		System.out.println("Test buscarPersonaPorTipo(profesor):");
		System.out.println("");
		for (Persona ele: atleti.buscarPersonaPorTipo("profesor")) {
			System.out.println(((Profesor)ele).ponerNotas());
			}
		System.out.println("");
		
		System.out.println("Test buscarPersonaPorTipo(administrativo):");
		System.out.println("");
		for (Persona ele: atleti.buscarPersonaPorTipo("AdminiSTRAtivo")) {
			System.out.println(((Administrativo)ele).gestionarMatricula());
			}
		System.out.println("");
		
		System.out.println("Test buscarPersonaPorTipo(zarangollo):");
		System.out.println("");
		for (Persona ele: atleti.buscarPersonaPorTipo("Zarangollo")) {
			System.out.println(ele);}
		System.out.println("");
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		// FIN DEL PROGRAMA
		//////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("FIN DEL PROGRAMA");
		System.out.println("-------------------------------------------------------------------");
		
	}

	// MÉTODOS PRIVADOS
	
	/**
	 * Método que imprime por pantalla el resultado <br>
	 * de buscarTodas() las personas de un ArrayList instituto.
	 * 
	 * @param instituto
	 * @since 1.0
	 */
	private static void printPersonas (Instituto instituto) {
		System.out.println("\nLista de personas actualizada:");
		for (Persona elemento: instituto.buscarTodas()) {
			System.out.println(elemento);}
		System.out.println("");
	}
	
}
