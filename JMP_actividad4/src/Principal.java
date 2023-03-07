
public class Principal {

	public static void main(String[] args) {
		
		
		/*
		 * Creación de objeto de la clase empleado con método constructor
		 * y con asignación de valor a cada atributo
		 */
		
		
		Empleado empleado1 = new Empleado ( 14628069 , "Julián" ,
											"Méndez Podadera" , 
											"julianmendezedix@gmail.com",
											50000 , 5000 , 'H' , 666 );
		
		
		/*
		 * LLamada a los métodos de la clase empleados
		 */
		
		
		System.out.println( empleado1 ) ; // Tras dudar, he decidido incluir el método toString como método propuesto.
		
		
		System.out.println( "El salario Bruto es: " + 
							        empleado1.salarioBruto() ) ;
		
		System.out.println( "El salario mensual es: " + 
							        empleado1.salarioMensual( 12 ) ) ;
		
		System.out.println( "El género es: " + 
									empleado1.literalSexo() ) ;
		
		System.out.println( "El resultado del método 'obtener email' es: " + 
							        empleado1.obtenerEmail() ) ;
		
		System.out.println( "El nombre completo es: " + 
		                            empleado1.nombreCompleto() ) ;
		
		
		/*
		 * Creación de objeto default
		 * e introducción de datos mediante los métodos get y set.
		 */
		
		
		Empleado empleado2 = new Empleado () ;
		
		empleado2.setIdEmpleado( 14628068 ) ;
		empleado2.setNombre( "Modesto" ) ;
		empleado2.setApellidos( "Méndez Podadera" ) ;
		empleado2.setEmail( "modestomendezedix@gmail.com" ) ;
		empleado2.setSalario( 60000 ) ;
		empleado2.setComplemento( 6000 ) ;
		empleado2.setSexo( 'H' ) ;
		empleado2.setIdDepartamento( 999 );
		
		System.out.println(empleado2);

	}

}
