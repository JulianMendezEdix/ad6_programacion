/*
 *	Este es el ejercicio 1 de "AI-2. Algoritmos de control en Java/eclipse." 
 	Alumno: Julián Méndez Podadera 1ºDAW EDIX 22-23
 */


import java.util.Scanner;

public class JMP_Actividad2_2 {
	
	public static void main(String[] args) {
		
		
		/*
		 *	Título y presentación del algoritmo.
		 */
		
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Este es el ejercicio 2 de AI-2: Algoritmos de control en Java/eclipse.");
		System.out.println("El algoritmo es un juego para adivinar un número.");
		System.out.println("Alumno: Julián Méndez Podadera 1ºDAW EDIX 22-23");
		System.out.println("----------------------------------------------------------------------");
		
		
		/*
		 * Definición e inicialización de variables
		 */
		
		int n = 0, m = 0, contador = 0;
		
		/*
		 * Entrada de información
		 */
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un número del 1 al 40 al que llamaremos N : ");
		n = leer.nextInt();
		
		while (n < 1 || n > 40) {
			
			System.out.println("Número erróneo. Introduzca un número del 1 al 40:");
			n = leer.nextInt();
			
		}
		
		
		System.out.println("----------------------------------------------------------------------");
		
		
		/*
		 * Entrada de información y Procesos.
		 */
		
		
		System.out.println("Hay que adivinar el número N.");
		System.out.println("Le diremos si el nuevo número que introduzca es mayor o menor que N.");
		System.out.println("Si adivina el número el programa finaliza. Comencemos!");
		
		while (m != n ) {
			
			System.out.println("Introduzca un número del 1 al 40:");
			m = leer.nextInt();
			System.out.println("----------------------------------------------------------------------");
			
			while (m < 1 || m > 40) {
				
				System.out.println("Número erróneo. Introduzca un número del 1 al 40:");
				n = leer.nextInt();
				
			}
			
			contador++;
			
			if ( m > n ) {
				System.out.println("El numero " + m + " es mayor que N");
			}
			
			else 
				if ( m < n ) {
					System.out.println("El número " + m + " es menor que N");
				}	
		
		}
		
		leer.close();	
		System.out.println("¡Enhorabuena! Has acertado N al " + contador + "º intento.");
		System.out.println("Fin del Programa");
		System.out.println("----------------------------------------------------------------------");
		
	}
	
	

}
