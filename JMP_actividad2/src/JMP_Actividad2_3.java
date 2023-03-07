/*
 *	Este es el ejercicio 3 de "AI-2. Algoritmos de control en Java/eclipse." 
 	Alumno: Julián Méndez Podadera 1ºDAW EDIX 22-23
 */


import java.util.Scanner;

public class JMP_Actividad2_3 {
	
	/*
	 * Algortimo
	 */
	
	
	public static void main(String[] args) {
		
		
		/*
		 *	Título y presentación del algoritmo.
		 */
		
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Este es el ejercicio 3 de AI-2: Algoritmos de control en Java/eclipse.");
		System.out.println("El algoritmo se basa en las especificaciones del ejercicio 3.");
		System.out.println("Alumno: Julián Méndez Podadera 1ºDAW EDIX 22-23");
		System.out.println("----------------------------------------------------------------------");
		
		
		/*
		 * Definición e inicialización de variables
		 */
		
		Scanner leer = new Scanner(System.in);
		
		char sexo = 'a';
		double salario = 0;
		String nombre = "";
		int contador = 0;
		double acumulador = 0;
		double media = 0;
		
		
		/*
		 * Entrada de información, Procesos, y salida de información.
		 */
		
		System.out.println("Introduzca un nombre: ");
		nombre = leer.next();
		
		while (!nombre.equalsIgnoreCase("fin")) {
			
			System.out.println("Introduce Salario: ");
			salario = leer.nextDouble();
			acumulador = acumulador + salario;
			System.out.println("Introduce sexo: ");
			sexo = leer.next().charAt(0);
			System.out.println("----------------------------------------------------------------------");
			System.out.println("El nombre es : " + nombre);
			System.out.println("El sexo es : " + funcionSexo(sexo));
			System.out.println("El salario es : " + funcionSalario(salario));
			contador++;
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Introduzca un nombre: ");
			nombre = leer.next();
		}
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Se han introducido " + contador + " nombres.");
		System.out.println("La suma de los salarios es : " + acumulador + "euros");
		media = acumulador / contador ; 
		System.out.println("La media de los salarios es : " + media + "euros");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("El programa ha finalizado");
		
		
		leer.close();
			
	}
	
	/*
	 * Función 1
	 */
	
	public static String funcionSexo (char sexo) {
		
		
		String genero = "";
		
		if ( sexo == 'H' || sexo == 'h' ) {	
			genero = "Hombre";
			return genero;
		}
		
		else	
			if (sexo == 'M' || sexo == 'm') {				
				genero = "Mujer";
				return genero;
			}
			
			else 
				genero = "Sexo Erróneo";
				return genero;
			
	}
	
	/*
	 * Función 2
	 */
	
	public static String funcionSalario (double salario) {
		
		String literalSalario = "";

		if (salario < 25000 && salario >= 0) 
		literalSalario = "Salario Bajo";
		
		else 
			if (salario >= 25000 && salario <= 40000)
				literalSalario = "Salario Medio";
		
			else
				if (salario > 45000)
					literalSalario = "Salario Alto";
				else 
					literalSalario =  "Salario no especificado en el enunciado del ejercicio.";
		
		return literalSalario;
		
	}
	
}

	

