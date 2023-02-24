package testing;
import modelo.javabean.*;

/**
 * 
 * Esta es la clase testing 'Principal', de la
 * actividad 6 de programacion DAW EDIX23.          
 * 
 * En ella probamos la funcionalidad de los
 * métodos creados en los javabeans.
 * 
 * @author JulianMendezEdix
 * @version 1.0
 */
public class Principal {
	
	public static void main(String[] args) {
		
		// Crea un objeto Profesor, un objeto Alumno y un objeto Administrativo.
		
		Profesor pro = new Profesor("11111111A", "Pepe Sancho", "Calle Paz", "654323232", 
				"Ingles");
		Alumno alu = new Alumno("22222222B", "Don Quijote", "Calle Luna", "543543543", 
				"1º ESO");
		Administrativo adm = new Administrativo("33333333B", "Luis Moya", "Calle Mar", 
				"654323232", "facturar, hacer café");
		
		// Ejecuta el método toString() sobre cada uno de ellos.
		
		System.out.println("-------------------------------------------------------------------"
				+ "-----------------");
		System.out.println("");
		System.out.println("- Métodos toString():");
		System.out.println("");
		System.out.println(pro.toString());
		System.out.println(alu.toString());
		System.out.println(adm.toString());
		System.out.println("");
		System.out.println("-------------------------------------------------------------------"
				+ "-----------------");
		System.out.println("");
		
		// Ejecuta el método trabajar() sobre cada uno de ellos.
		
		System.out.println("- Métodos trabajar():");
		System.out.println("");
		System.out.println(pro.trabajar());
		System.out.println(alu.trabajar());
		System.out.println(adm.trabajar());
		System.out.println("");
		System.out.println("-------------------------------------------------------------------"
				+ "-----------------");
		System.out.println("");
		
		// Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.
		
		System.out.println("- Método llamada alumno a profesor; ");
		System.out.println("");
		System.out.println(alu.llamar(pro));
		System.out.println("");
		System.out.println("-------------------------------------------------------------------"
				+ "-----------------");
		System.out.println("");
		
		// Ejecuta el método ponerNotas() del objeto Profesor.
		
		System.out.println("- Método ponerNotas() del objeto Profesor:");
		System.out.println("");
		System.out.println(pro.ponerNotas());
		System.out.println("");
		System.out.println("-------------------------------------------------------------------"
				+ "-----------------");
		System.out.println("");
		
		// Ejecuta el método hacerExamen() del objeto Alumno.
		
		System.out.println("- Método hacerExamen() del objeto Alumno: ");
		System.out.println("");
		System.out.println(alu.hacerExamen());
		System.out.println("");
		System.out.println("-------------------------------------------------------------------"
				+ "-----------------");
		System.out.println("");
		
		// Ejecuta el método gestionarMatricula() del objeto Administrativo.
		
		System.out.println("- Método gestionarMatricula() del objeto "
				+ "Administrativo:");
		System.out.println("");
		System.out.println(adm.gestionarMatricula());
		System.out.println("");
		System.out.println("-------------------------------------------------------------------"
				+ "-----------------");
		System.out.println("");
		System.out.println("FIN DEL PROGRAMA");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------"
				+ "-----------------");
		
	}

}
