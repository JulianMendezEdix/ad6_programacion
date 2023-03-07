/*
 *	Este es el ejercicio 1 de "AI-2. Algoritmos de control en Java/eclipse." 
 	Alumno: Julián Méndez Podadera 1ºDAW EDIX 22-23
 */


import java.util.Scanner;

public class JMP_Actividad2_1 {

	public static void main(String[] args) {
			
		
		/*
		 *	Título y presentación del algoritmo.
		 */
		
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Este es el ejercicio 1 de AI-2: Algoritmos de control en Java/eclipse.");
		System.out.println("El algoritmo lee, procesa y escribe información sobre un triángulo.");
		System.out.println("Alumno: Julián Méndez Podadera 1ºDAW EDIX 22-23");
		System.out.println("----------------------------------------------------------------------");
		
		
		/*
		 * Definición e inicialización de variables
		 */
		
		
		int ladoA = 0, ladoB = 0, ladoC = 0 ;
		 
		 
		/*
		 * Entrada de información
		 */
		 
		 
		Scanner leer = new Scanner(System.in);
		 
		System.out.println("Introduzca el lado A del triángulo : ");
		ladoA = leer.nextInt();
		 
		System.out.println("Introduzca el lado B del triángulo : ");
		ladoB = leer.nextInt();
		 
		System.out.println("Introduzca el lado C del triángulo : ");
		ladoC = leer.nextInt();
		 
		leer.close();
		 
		System.out.println("----------------------------------------------------------------------");
		  
		
		/*
		 * Procesos y salida de información del apartado A del ejercicio.
		 */
		 
		
		if ( (ladoA + ladoB) > ladoC && 
			  (ladoA + ladoC) > ladoB && 
			  (ladoB + ladoC) > ladoA    ) 
			 
			System.out.println("Apartado A: Los lados introducidos forman un triángulo correcto.");
		  
		else
			System.out.println("Apartado A: Los lados introducidos no forman un triángulo correcto.");
		 
		 
		/*
		 * Procesos y salida de información del apartado B del ejercicio.
	     */
		  
		  
		if ( ladoA == ladoB && ladoA == ladoC )
			System.out.println("Apartado B: El triángulo es equilátero."); 
		  
		else
			if ( ladoA != ladoB && ladoA != ladoC && ladoB != ladoC )
				System.out.println("Apartado B: El triángulo es escaleno.");
			else 
				System.out.println("Apartado B: El triángulo es isósceles.");
		 
		System.out.println("----------------------------------------------------------------------");
		 
		 
		/*
		 * Fin del Programa
	     */
		 
		 
		System.out.println("El programa ha finalizado.");
		System.out.println("----------------------------------------------------------------------");
		 
		 
	}

}
