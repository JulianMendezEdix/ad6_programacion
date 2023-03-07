import java.util.Scanner;

public class Ejercicio02AdivinarNumero {

	public static void main(String[] args) {
		/*
		 * Definición de variables
		 */
		Scanner leer = new Scanner(System.in);
		int aleatorio = 0;
		int numeroLeido, intentos = 1;
		
		
		aleatorio = (int)(Math.random()* 40 -1);
//	 	System.out.println(aleatorio);
		
		
		
		System.out.println("Introduce un numero del 1 al 40");
		numeroLeido = leer.nextInt();
		
		while(numeroLeido != aleatorio) {
			
			if (numeroLeido > aleatorio)
				System.out.println("El numero buscado es menor!!!");
			else
				System.out.println("El numero buscado es mayor!!!");
			
			System.out.println("Introduce un numero del 1 al 40");
			numeroLeido = leer.nextInt();
			
			intentos++;
		}
		
		System.out.println("Numero " + aleatorio + " encontrado");
		System.out.println("Has usado : " + intentos + " intentos");
		
		leer.close();

	}

}
