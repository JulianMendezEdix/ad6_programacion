package modelo.dao;
import modelo.javabean.*;
import java.util.List;

/**
 *  Este es el Interface 'InstitutoDao' propuesto en la actividad 6.
 *  
 * @author JulianMendezEdix
 * @version 1.0
 */
public interface InstitutoDao {
	
	boolean altaPersona(Persona persona);
	Persona buscarPersona(String nif);
	List<Persona> buscarTodas();
	boolean eliminarPersona(Persona persona);
	List<Persona> buscarPersonaPorTipo(String tipoPersona);

}
