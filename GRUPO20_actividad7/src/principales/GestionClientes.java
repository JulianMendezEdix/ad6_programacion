package principales;
import java.util.Scanner;

import daos.ClienteDao;
import daos.ClienteDaoImplMy8;
import javabeans.Cliente;

public class GestionClientes {
	
	private static Scanner leer;
	static {
		leer = new Scanner(System.in);
	}

	public static void main(String[] args) {
		
		ClienteDao cdao = new ClienteDaoImplMy8();
		
		int opcion = 0;
		opcion = menuPrincipal();

		while (opcion != 5) {
			
			switch(opcion) {
			
				case 1:
					System.out.println("Introduzca cif del nuevo cliente: ");
					String cif1;
					cif1 = leer.next();
					System.out.println("Introduzca nombre del nuevo cliente: ");
					String nom1;
					nom1 = leer.next();
					System.out.println("Introduzca apellidos del nuevo cliente: ");
					String ape1;
					ape1 = leer.next();
					System.out.println("Introduzca domicilio del nuevo cliente: ");
					String dom1;
					dom1 = leer.next();
					System.out.println("Introduzca facturacion anual del nuevo cliente: ");
					float  fac1;
					fac1 = leer.nextFloat();
					System.out.println("Introduzca numero de empleados del nuevo cliente: ");
					int num1;
					num1 = leer.nextInt();
					Cliente cli1 = new Cliente(cif1, nom1, ape1, dom1, fac1, num1);
					System.out.println(cdao.altaCliente(cli1));
					break;
					
				case 2: 
					System.out.println("Introduzca cif del cliente que desea buscar: ");
					String aux;
					aux = leer.next();
					System.out.println( cdao.buscarCliente(aux));
					break;
					
				case 3:
					for (Cliente ele: cdao.buscarTodos())
						System.out.println(ele);
					break;
					
				case 4:
					System.out.println("Introduzca cif del cliente que desea eliminar: ");
					String aux2;
					aux2 = leer.next();
					System.out.println( cdao.eliminarCliente(aux2));
					break;
		}
			
			opcion = menuPrincipal();
			
		}
		
		System.out.println("FIN DE PROGRAMA");
		leer.close();
		
	}
	
	public static int menuPrincipal() {
		int opcion = 0;
	
	System.out.println("\n\n1.- Alta del Cliente");
	System.out.println("2.- Buscar un Cliente");
	System.out.println("3.- Mostrar Todos");
	System.out.println("4.- Eliminar un cliente");
	System.out.println("5.- Salir");
	
	System.out.println("teclea una opcion del 1 al 4, 5 para salir");
	opcion = leer.nextInt();
	
	while(opcion < 1 || opcion > 5) {
		System.out.println("opciones del 1 al 5");
		opcion = leer.nextInt();
	}
	
	return opcion;
}

}
