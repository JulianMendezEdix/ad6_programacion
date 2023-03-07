
public class Empleado {
	
	
	// Propiedades privadas
	
	
	private int idEmpleado;
	private String nombre, apellidos, email;
	private double salario, complemento;
	private char sexo;
	private int idDepartamento;
	
	
	// Método Constructor Default
	
	
	public Empleado () {
		super();
	}
	
	
	// Método Constructor
	
	
	public Empleado ( int idEmpleado , String nombre , String apellidos , 
			          String email , double salario , 
			          double complemento , char sexo , 
			          int idDepartamento ) {
		
		super();
		this.idEmpleado = idEmpleado ;
		this.nombre = nombre ;
		this.apellidos = apellidos ;
		this.email = email ;
		this.salario = salario ;
		this.complemento = complemento ;
		this.sexo = sexo ;
		this.idDepartamento = idDepartamento ;
	
		
	}
	
	
	// Método toString redefinido
	
	
	public String toString () {
		
		return ("------------------------------------------\n" + 
				"Identificación Empleado: " + idEmpleado + "\n" +
				"Nombre: " + nombre + "\n" +
	     		"Apellidos: " + apellidos + "\n" +
	     		"Email: " + email + "\n" +
	     		"Salario: " + salario + "\n" +
	     		"Complemento: " + complemento + "\n" +
	     		"Sexo: " + sexo + "\n" +
				"Identificación Departamento: " + idDepartamento + "\n" +
				"------------------------------------------" );
		
	}
	
	
	
	
	// Métodos Set y Get
	
	
	public void setIdEmpleado ( int idEmpleado ) {
		
		this.idEmpleado = idEmpleado ;
		
	}
	
	public int getIdEmpleado () {
		
		return idEmpleado ;
		
	}
	
	public void setNombre ( String nombre ) {
		
		this.nombre = nombre ;
		
	}
	
	public String getNombre () {
		
		return nombre ;
		
	}
	
	public void setApellidos ( String apellidos ) {
		
		this.apellidos = apellidos ;
		
	}
	
	public String getApellidos () {
		
		return apellidos ;
		
	}
	
	public void setEmail ( String email ) {
		
		this.email = email ;
		
	}
	
	public String getEmail () {
		
		return email ;
		
	}
	
	public void setSalario ( double salario ) {
		
		this.salario = salario ;
		
	}
	
	public double getSalario () {
		
		return this.salario ;
		
	}
	
	public void setComplemento ( double complemento) {
		
		this.complemento = complemento ;
		
	}
	
	public double getComplemento () {
		
		return this.complemento ;
		
	}
	
	public void setSexo ( char sexo ) {
		
		this.sexo = sexo ;
		
	}
	
	public char getSexo () {
		
		return this.sexo ;
		
	}

	public void setIdDepartamento ( int idDepartamento ) {
		
		this.idDepartamento = idDepartamento ;
		
	}
	
	public int getIdDepartamento () {
		
		return this.idDepartamento ;
		
	}

	
	// Métodos propios
	
	
	public double salarioBruto () {
		
		return this.salario + this.complemento ;
		
	}
	
	public double salarioMensual ( int meses ) {
		
		return (this.salario + this.complemento) / meses ;
		
	}

	public String literalSexo () {
		
		String genero = "";
		
			if ( this.sexo == 'H' || this.sexo == 'h' ) {	
				genero = "Hombre";
				return genero;
			}
			
			else	
				if (this.sexo == 'M' || this.sexo == 'm') {				
					genero = "Mujer";
					return genero;
				}
				
				else 
					genero = "Sexo Erróneo";
					return genero;
		
	}

	public String obtenerEmail () {
		
		char inicial;
		inicial = (this.nombre.charAt(0));
		return (inicial + this.apellidos.split(" ")[0]).toLowerCase();
	
	}
	
	public String nombreCompleto () {
		
		return this.nombre + " " + this.apellidos ;
		
	}
	
	
}
