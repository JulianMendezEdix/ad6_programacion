import java.util.Scanner;

public class Actividad3 {
	private static Scanner leer;
	static {
		leer = new Scanner(System.in);
	}

	public static void main(String[] args) {
		 
		int opcion = 0;
		opcion = menuPrincipal();
		
		while (opcion != 4) {
			
			switch(opcion) {
				case 1:
					System.out.println(binario());
					break;
				case 2:
					calculadora();
					break;
				case 3:
					analizadorFrase();
					break;
		
		}
			opcion = menuPrincipal();
		}
		
		System.out.println("FIN DE PROGRAMA");
		leer.close();
	}
	public static void calculadora() {
		int op1 = 0, op2 = 0;
		char opcion = ' ';
		
		System.out.println("Introduce dos numeros");
		op1 = leer.nextInt();
		op2 = leer.nextInt();
		
		System.out.println("escoge una operacion : + - * / %");
		opcion = leer.next().charAt(0);
		switch(opcion) {
			case '+':
				System.out.println("la suma de los numeros es : " + (op1 + op2));
				break;
			case '-':
				System.out.println("la resta de los numeros es : " + (op1 - op2));
				break;
			case '*':
				System.out.println("el producto de los numeros es : " + (op1 * op2));
				break;
			case '/':
				System.out.println("la división de los numeros es : " + (op1 / op2));
				break;
			case '%':
				System.out.println("el resto de la division  de los numeros es : " + (op1 % op2));
				break;
			default:
				System.out.println("opcion incorrecta");	
		
		}
		
		
		
		
		
	}
	
	public static String binario() {
		int numero = leer.nextInt(), cociente=0;
		String restos = "", reverse = "";
		
		if (numero == 1 || numero == 0 )
			 return reverse += numero;
			
		cociente = numero/2;
		restos += numero%2;
		
		while (cociente != 1) {
			restos += cociente%2;
			cociente /= 2;
		}
		restos += 1;
		
		for (int i = restos.length()-1; i >= 0; i--)
			reverse += restos.charAt(i);
		
		return reverse;
	};
	
	public static void analizadorFrase() {
		String frase = null, vocales = "", consonantes="";
		char letra =' ';
		frase = leer.next();
		frase = frase.toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			 letra = frase.charAt(i);
			if (letra == 'a' || 
					letra == 'e' ||
					letra == 'i' ||
					letra == 'o' ||
					letra == 'u' 	)
				vocales += letra;
			else
				if (letra >= 'b' && letra<= 'z' || letra == 'ñ')
					consonantes += letra;
			
		}
		
		System.out.printf("%-20s %-20s %-20s %-20s\n", "PALABRA","CONSONANTES", "VOCALES", "LONGITUD");
		System.out.printf("%-20s %-20s %-20s %-20s\n", frase,consonantes, vocales, frase.length());
	
		
	}
	
	public static int menuPrincipal() {
			int opcion = 0;
		
		System.out.println("\n\n1.- Conversor Decimal-binario");
		System.out.println("2.- Calculadora");
		System.out.println("3.- Analizador de frase");
		System.out.println("4.- Salir");
		
		System.out.println("teclea una opcion del 1 al 3, 4 para salir");
		opcion = leer.nextInt();
		
		while(opcion < 1 || opcion > 4) {
			System.out.println("opciones del 1 al 4");
			opcion = leer.nextInt();
		}
		
		return opcion;
	}
	
	public static void binario2() {
		int numero = leer.nextInt(); 
		String binario="";
		
		
		binario = Integer.toBinaryString(numero);
		System.out.println(binario);
		
		
		}
	
	 

}
