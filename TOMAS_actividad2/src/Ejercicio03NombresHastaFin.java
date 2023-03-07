import java.util.Scanner;

public class Ejercicio03NombresHastaFin {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String nombre = null;
		 
		int sumaSalarios = 0, contador = 0;
		double salario = 0;
		char genero = ' ';
			
			
			System.out.println("Introduce un nombre");
			nombre = leer.next();
			
			while(!nombre.equalsIgnoreCase("fin")) {
				System.out.println("Introduce un salario");
				salario = leer.nextDouble();
				System.out.println("Introduce un genero h o m");
				genero = leer.next().charAt(0);
				
				System.out.println("Tipo salario : " + verSalario(salario));
				System.out.println("Literal del Genero : " + verGenero(genero));
				
				sumaSalarios += salario;
				contador++;
				
				System.out.println("Introduce un nombre");
				nombre = leer.next();
				
			}
			
			System.out.println("Nombres leidos : " + contador);
			System.out.println("Suma de salarios : "+ sumaSalarios);
			if (contador != 0)
				System.out.println("La media es : " + sumaSalarios/contador);
			else
				System.out.println("La media es 0");

	}
	
	public static String verGenero(char sexo) {
		switch (sexo) {
		case 'H': case 'h':
			return "Hombre";
		case 'M': case 'm':
			return "Mujer";
			default:
				return "género incorrecto";
		}
	}
	
	public static String verSalario(double sueldo) {
		/*
		 * Salario < de 25.000 : “Salario Bajo”.
		 * Salario entre 25.000 y 45.000: “Salario Medio”.
		 * Por encima de 45.000: “Salario Alto”
		 */
		if (sueldo < 25000)
			return "Salario bajo";
		else if (sueldo >= 25000 && sueldo <= 45000)
			return "Salario Medio";
		else
			return "Salario Alto";
	}

}
