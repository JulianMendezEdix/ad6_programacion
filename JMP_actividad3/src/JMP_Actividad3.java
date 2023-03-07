import java.text.DecimalFormat;
import java.util.Scanner;

public class JMP_Actividad3 {

	public static void main(String[] args) {
		
		//Scanner leer = new Scanner(System.in);
		
		/*
		 *	Título y presentación del algoritmo.
		 */
		
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Este es el ejercicio 3 de AI-2: Algoritmos de control en Java/eclipse.");
		System.out.println("El algoritmo se basa en las especificaciones del ejercicio 3.");
		System.out.println("Alumno: Julián Méndez Podadera 1ºDAW EDIX 22-23");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("");
		
		
		
		/*
		 * Definición e inicialización de variables
		 */
		
		int opcion = 0;
		
		
		/*
		 * Entrada de información, Procesos, y salida de información.
		 */
		
		opcion = menu();
		
		switch (opcion) {
		
			case 1:
				conversorDecBin();
				break;
			case 2: 
				calculadora();
				break;
			case 3:
				analizadorFrase();
				break;
			case 4:
				System.out.println("Adios");
				break;
		}
		
		System.out.println("--------------------------");
		System.out.println("Fin del Programa");
	}
			
	public static int menu() {
		
		Scanner leer = new Scanner(System.in);
		
		int opcion = 0;
		
		System.out.println("********** MENU **********)");
		System.out.println("--------------------------");
		System.out.println("1. Conversor decimal-binario");
		System.out.println("2. Calculadora");
		System.out.println("3. Analicador de frase");
		System.out.println("4. Salir");
		System.out.println("");
		System.out.println("Introduce una opcion: ");
		
		opcion = leer.nextInt();
		
		
		while (opcion<1 || opcion >4) {
			
			System.out.println("Opción errónea. Teclee opción válida (del 1 al 4)");
			opcion = leer.nextInt();
		
		}
		
		
		
		return opcion;
		
		
		
	}
	
	public static void conversorDecBin() {
		
		Scanner leer = new Scanner(System.in);
		
		int n = 0;
		String bin = "hh";	
		
		System.out.println("Introduzca un numero entero: ");
		n = leer.nextInt();
		
		bin = Integer.toBinaryString(n);
		
		System.out.println("El número " + n + " en binario es " + bin);
		
		leer.close();
		
	}
	
	public static void calculadora () {
		
		Scanner leer = new Scanner(System.in);
		DecimalFormat formateador = new DecimalFormat("####.##");
		
		double num1 = 0.0 , num2 = 0.0 , resultado = 0.0;
		String operador = "hh";
		
		
		System.out.println("Introduce el primer numero: ");
		num1 = leer.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		num2 = leer.nextDouble();
		System.out.println("Introduce un operador (+,-,*,/,%)");
		operador = leer.next();
		
		switch (operador) {
		
			case "+":
				resultado = num1 + num2;
				System.out.println(num1 + " " + operador + " " + num2 + " = " + formateador.format(resultado));
				break;
			case "-":
				resultado = num1 - num2;
				System.out.println(num1 + " " + operador + " " + num2 + " = " + formateador.format(resultado));
				break;
			case "*":
				resultado = num1 * num2;
				System.out.println(num1 + " " + operador + " " + num2 + " = " + formateador.format(resultado));
				break;
			case "/":
				resultado = num1 / num2;
				System.out.println(num1 + " " + operador + " " + num2 + " = " + formateador.format(resultado));
				break;
			case "%":
				resultado = num1 % num2;
				System.out.println(num1 + " " + operador + " " + num2 + " = " + formateador.format(resultado));
				break;
		}
		
		leer.close();
			
		
	}
	
	public static void analizadorFrase () {
		
		Scanner leer = new Scanner(System.in);
		
		String palabra = "";
		String vocal="", consonante="" ;
		
		System.out.println("Introduzca una palabra: ");
		palabra = leer.next();
		
		for (int i=0;  i<palabra.length();  i++) {
			
			char letra;
			letra = palabra.charAt(i);
			
			if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u'))
				vocal+=letra;
			else 
				consonante+=letra;
			
		}
		
		
		System.out.println("PALABRA          CONSONANTES          VOCALES          LONGITUD");
		System.out.println("------------------------------------------------------------------");
		
		System.out.println(palabra + "     " + consonante + "              " + vocal + "            " + palabra.length());
		
		leer.close();
		
		
	}
	
}





