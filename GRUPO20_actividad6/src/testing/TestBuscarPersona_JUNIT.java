package testing;

import modelo.dao.*;
import modelo.javabean.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase 'TestBuscarPersona' para realizar las pruebas unitarias <br>
 * con junit5 sobre el método buscarPersona() de la clase 'Instituto'
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
class TestBuscarPersona_JUNIT {
	
	Instituto atleti = new Instituto();

	/**
	 * 1er Test que testea el método altaPersona.<br><br>
	 * a) Damos el alta de una persona con un nif que no existe
	 * por lo que se debería añadir a la lista y devolver TRUE.<br>
	 * b) el nif de la persona que hemos dado el alta tiene que<br>
	 * ser igual que el NIF de la persona que encuentra el método.
	 * 
	 */
	@Test
	void testBuscarPersona1() {
		Persona alu = new Alumno("11111111A", null, null, null, null);
		assertTrue(atleti.altaPersona(alu));
		assertEquals(alu.getNif(), atleti.buscarPersona("11111111A").getNif());
	}
	
	/**
	 * 2do Test que testea el método altaPersona.<br><br>
	 * Buscamos una persona con un nif que no existe por 
	 * lo que esperamos que el método devuelva null.
	 * 
	 */
	@Test
	void testBuscarPersona2() {
		assertNull(atleti.buscarPersona("00000000A"));
	}
	
}
