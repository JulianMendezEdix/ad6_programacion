package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.dao.Instituto;

/**
 * Clase 'TestAltaPersona' para realizar las pruebas unitarias <br>
 * con junit5 sobre el método buscarTodas() de la clase 'Instituto'
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
class TestBuscarTodas_JUNIT {
	
	Instituto atleti = new Instituto();

	/**
	 * Test que testea el método buscarTodas().<br><br>
	 * Esperamos que el método y el getPersonas devuelvan el mismo ArrayList.
	 */
	@Test
	void test() {
		assertEquals(atleti.getPersonas(), atleti.buscarTodas());
	}

}
