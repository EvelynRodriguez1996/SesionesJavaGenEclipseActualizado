package Persona;

public class Persona {
	//1. Atributos (info de cómo se mostrará mi objeto cuanso se instancie)
	
		String nombre;
		String apellido;
		byte edad; //para tener una correcta asignación de memoria
		String telefono;
		String email;
		
		
		
		//2. Constructor con parámetros
		Persona(String nombre, String apellido, byte edad, String telefono, String email) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.telefono = telefono;
			this.email = email;
		}//cierre de constructor
		
		//3. Métodos (lo que podrá hacer mi objeto)
		
		void imprimirInfo() {
			System.out.println("El nombre es: " +  nombre);
			System.out.println("el apellido es: " +  apellido);
			System.out.println("La edad es: " +  edad);
			System.out.println("El telefono es: " +  telefono);
			System.out.println("El email es: " +  email);
		}//imprimirInfo
		
		void saludar() {
			System.out.println("Hola, te mando saluditos");
		}//saludar

		
		
		
		//toString 
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
					+ ", email=" + email + "]";
		}
		
		//4. Instancia

}// Cierre poo