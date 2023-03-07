import java.util.Scanner;

public class Ejercicio01Triangulos {

	public static void main(String[] args) {
		int lado1= 1, lado2=2, lado3 = 3;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce valor para cada lado, cada vez");
		lado1 = leer.nextInt();
		lado2 = leer.nextInt();
		lado3 = leer.nextInt();
		
		if (lado1 + lado2 > lado3 && lado1+ lado3 > lado2 && lado2+lado3 > lado1) {  
			System.out.print("Triángulo válido y además es : ");
			if (lado1 == lado2 && lado2== lado3 )
				System.out.println("Equilátero");
			else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
				System.out.println("isósceles");
			else
				System.out.println("escaleno");
			
		} else
			System.out.println("triángulo inválido");
		
		
		
 		
		
		
		leer.close();
		 
	}

}
