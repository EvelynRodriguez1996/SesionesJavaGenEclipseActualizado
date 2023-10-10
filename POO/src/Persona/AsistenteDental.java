package Persona;

public class AsistenteDental {
	//Atributos
		private String fechaIngreso;
		private double salario;
		
		
		/* 
		 Generalmente, el constructor siempre va en publico para evitar errores al momento de la instancia
		 */
		//2. Constructor público
		public AsistenteDental(String fechaIngreso, double salario) {
			this.fechaIngreso = fechaIngreso;
			this.salario = salario;
		}//Constructor
		
		
		
		//3. Métodos
		
		//Método para imprimir información 
		public  void mostrarDatosAsistente() {
			System.out.println("La fecha de ingreso de la asistente es: " + fechaIngreso);
			System.out.println("el salario del asistente es: " + salario);
		}//mostrarDatosAsistente
		
		
		//Getters y setters para poder acceder a mis datos privados y poder realizar operaciones con ellos.
		//sin getters, la informacipon me aparece en null
		//Sin setters, no puedo cambiar la información
		
		//Este getter permite retornar el dato de la fecha de ingreso en formato String
		public String getFechaIngreso() {
			return fechaIngreso;
		}//getter
		
		//getter para salario
		public double getSalario() {
			return salario;
		}
		
		//setter para salario (modificar los datos)
		public void setSalario(double nuevoSalario) {
			if(nuevoSalario > 0 && nuevoSalario < 100) {
				salario = nuevoSalario;
			}//cierre if
		}//cierre setter
		
}