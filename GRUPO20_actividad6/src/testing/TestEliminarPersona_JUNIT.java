package testing;

import modelo.dao.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase 'TestElimiarPersona' para realizar las pruebas unitarias <br>
 * con junit5 sobre el método altaPersona() de la clase 'Instituto'
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
class TestEliminarPersona_JUNIT {
	
	Instituto atleti = new Instituto();

	/**
	 * 1er Test que testea el método eliminarPersona.<br><br>
	 * 
	 * a) Buscamos una persona y comprobamos que está en el array.<br>
	 * b) Esperamos que el método eliminarPersona nos de TRUE al<br>
	 *      usarlo con la persona que hemos buscado, es decir, que ha eliminado<br> 
	 *      a esa persona.
	 */
	@Test
	void test1() {
		assertNotNull(atleti.buscarPersona("14628060A"));
		assertTrue(atleti.eliminarPersona(atleti.buscarPersona("14628060A")));
	}
	
	/**
	 * 2do Test que testea el método eliminarPersona.<br><br>
	 * 
	 * a) Buscamos una persona y comprobamos que no está en el array.<br>
	 * b) Esperamos que el método eliminarPersona() nos de FALSE al<br>
	 *      usarlo con la persona que hemos buscado, es decir, que no ha eliminado<br> 
	 *      a esa persona porque no la ha encontrado.
	 */
	@Test
	void test2() {
		assertNull(atleti.buscarPersona("00000000A"));
		assertFalse(atleti.eliminarPersona(atleti.buscarPersona("00000000A")));
	}
	
}
