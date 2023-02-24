package testing;

import modelo.dao.Instituto;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

/**
 * 
 * Esta es la clase testing 'TestBuscarPersonasPorTipo', de la
 * actividad 6 de programacion DAW EDIX23.          
 * 
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class TestBuscarPersonasPorTipo {

	public static void main(String[] args) {
		
		Instituto atleti = new Instituto();
		
		//////////////////////////////////////////////////////////////////////////////////////////
		//TESTS buscarPersonaPorTipo()
		//////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Test buscarPersonaPorTipo(alumno):");
		System.out.println("");
		
		//Recorremos la lista y hacemos un casting de cada elemento de clase Persona para
		//convertirlo en clase Alumno y así poder usar los métodos de Alumno.
		for (Persona ele: atleti.buscarPersonaPorTipo("alumno")) {
			System.out.println(((Alumno)ele).hacerExamen());
			}
		System.out.println("");
		
		//Recorremos la lista y hacemos un casting de cada elemento de clase Persona para
		//convertirlo en clase Profesor y así poder usar los métodos de Profesor.
		System.out.println("Test buscarPersonaPorTipo(profesor):");
		System.out.println("");
		for (Persona ele: atleti.buscarPersonaPorTipo("profesor")) {
			System.out.println(((Profesor)ele).ponerNotas());
			}
		System.out.println("");
		
		//Recorremos la lista y hacemos un casting de cada elemento de clase Persona para
		//convertirlo en clase Adiministrador y así poder usar los métodos de Administrador.
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
	}

}
