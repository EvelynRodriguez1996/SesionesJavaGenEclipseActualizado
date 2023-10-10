package Persona;

public class Dentista extends Persona {
	/*
	 * Ya no creo valores como nombre, edad, apellido, etc., porque estos valores los voy a heredar de la clase Persona
	 */
	
	//1. Atributos
	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario = 500;
	
	//2. Constructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,
			String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email); //información de la clase Persona
		//Información de la clase Dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}//constructor
	
	//3. Métodos
	//Método para calcular salario basado en la experiencia
	/*Experiencia = básico, intermedio, avanzado
	//Si el dentista está en 
	 * Rango básico, gana 30,000. 
	 * Si es intermedio, gana 40,000. 
	 * Si es avanzado gana 50,000.
	 */
	
	void calcularSalario() {
		//lógica de programación
		if(experiencia.equals("basico")) {
			salario = 30000;
		}else if(experiencia.equals("intermedio")) {
			salario = 40000;
		}else if(experiencia.equals("avanzado")) {
			salario = 50000;
		}
	}//calcularSalario
	
	
	void imprimirInfoDentista() {
		System.out.println("La especialidad: " + especialidad);
		System.out.println("El salario es: " + salario);
	}//imprimirIfoDentista
	
	

}