package testing;

import modelo.dao.*;
import modelo.javabean.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase 'TestAltaPersona' para realizar las pruebas unitarias <br>
 * con junit5 sobre el método altaPersona() de la clase 'Instituto'
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
class TestAltaPersona_JUNIT {
	
	Instituto atleti = new Instituto();

	/**
	 * 1er Test que testea el método altaPersona.<br><br>
	 * Damos el alta de una persona con un nif que no existe
	 * por lo que se debería añadir a la lista y devolver TRUE.
	 * 
	 */
	@Test
	void testAltaPersona() {
		Alumno alu = new Alumno("1A", "X", "X", "X", "X");
		assertTrue(atleti.altaPersona(alu));
	}
	
	/**
	 * 2do Test que testea el método altaPersona.<br><br>
	 * Damos el alta de una persona con un nif que ya existe
	 * por lo que no se debería añadir a la lista y esperamos
	 * que devuelva FALSE.
	 * 
	 * 
	 */
	@Test
	void testAltaPersona2() {
		Alumno alu2 = new Alumno("14628060A", "X", "X", "X", "X");
		assertFalse(atleti.altaPersona(alu2));
	}

}
