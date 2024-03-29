package Animal;

public class Perro extends Animal { //Herencia de la clase superior Animal

	
		//"Polimorfear" o sobreescribir el metodo heredado
	
	
	@Override //con la anotacion @override, le decimos a Java que el metodo hacerSonido sera sobreescrito 
		public void hacerSonido() {
			
			System.out.println("El perrito ladra y hace guua");
			}//metodo hacerSonido heredado de Animal
		
		
	
	public static void main(String[]args) {
		
		//Aqui No hay polimorfismo, ya que instancio un animal generico, y utilizo su metodohacerSonido
		Animal Generico = new Animal (); //Genera un animal generico 
		Generico.hacerSonido();
		
		
		//Genera la instancia de mi perrito 
		//Si hay polimorfismo, porque es el equivalente a decir "instancioun animal que es un perrito"
		//Referenciar primero la clase general, y luego la instancia particular, permite el polimorfismo
		
		Animal Chilaquil = new Perro (); //Genera un animal generico (abstracto)
		Chilaquil.hacerSonido();
	}//metodo main 

	 

}//cierre clase Perro 
