package dataTypes;

public class DatosEstructurados {
 public static void main(String[]args) {
	/*
	 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
	 * -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String
	 * -- Arrays.
	 * -- Creados por el usuario (API Java)
*/
	String myString = "Hola soy un string";
	System.out.println(myString);
	
	String helloString = new String ("Hola soy un segundo string");
	System.out.println(helloString);
	
	/*Métodos para string
	 * */
	//length: método que permite medir la longitud de una cadena de caracteres.
	String texto = "ASFHGHNF";
	System.out.println("La longitud de la variable de tipo string es " + texto.length());
	
	/*
	 * Guardando la variable texto en una nueva variable de tipo int para pasarle el método length
	 * int metodoLength = texto.length();
	 *--Output: 8
	 *Imprimimos en consola la nueva variable
	 *System.out.println(metodoLength);
	 */
	
	//toUpperCase() y toLowerCase()
	String upperCase = texto.toUpperCase();
	System.out.println("Aplicando el método toUpperCase " + upperCase);
	
	String lowerCase = texto.toLowerCase();
	System.out.println("Aplicando el método toLowerCase " + lowerCase);
	
	//indexOf() Devuelve el índice de la primera aparición de un texto especifico
	String fraseMotivacional = "Todo es temporal, echale ganitas";
	int indexOf = fraseMotivacional.indexOf("temporal");//8
	System.out.println("La palabra 'temporal' inicia en el indice " + indexOf);
	
	//concatenación
	String firstName = "Daniel";
	String lastName = "Maldonado";
	
	String userName = firstName + " " + lastName;
	System.out.println(userName);
	
	System.out.println(firstName.concat(lastName));
	
	//métodos de conversión (parseo)
	String presupuesto = "50000";
	System.out.println("El presupuesto es de $ " + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
	
	int parseado = Integer.parseInt(presupuesto);
	System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseado + " que ahora es de tipo " + ((Object)parseado).getClass().getSimpleName());
	
	//parsear de String a double
	String cadena = "400.289";
	System.out.println("Se imprime la variable 'cadena': " + cadena + " cuyo tipo de dato es " + cadena.getClass().getSimpleName());
	
	double cadenaParseada = Double.parseDouble(cadena);
	System.out.println("Aplicando parseDouble, el valor de " + cadena + " de tipo " + cadena.getClass().getSimpleName() + " ahora es " + cadenaParseada + " que ahora es de tipo " + ((Object)cadenaParseada).getClass().getSimpleName());
	
	
	/*Arrays
	 * Conocidos como arreglos, se trata de una colección de datos del mismo tipo donde cada elemento corresponde a una posición identificada por índices numéricos. Cuando trabajamos con arreglos de dos dimensiones (bidimensionales), usamos el término matriz.
	 * */
	
	String [] carros = {"Volkswagen","Mazda","Kia","Ford"};
	System.out.println(carros);
	
	/*Variables por tipo de declaración
	 * -- Dinámicas: son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso
	 * -- Constantes o finales: su valor no puede modificarse
	 * -- Literales: palabras reservadas, su identificador es la representación de su valor y ya tiene un significado en el código fuente de JAVA.
	 * */
	
	//Dinámicas
	float gastosMensuales = 35684.30f;
	System.out.println(gastosMensuales);
	
	gastosMensuales = 42699.2f;
	System.out.println("Ahora mis gastos mensuales ascienden a " + gastosMensuales);
	
	//Constantes
	final int SALARIO = 15000;
	System.out.println(SALARIO);
	
	//Literales
	int booleano = 15; //no se puede utilizar la palabra "boolean" para declarar la variable porque ya es palabra reservada en JAVA
	
	
	
	
 }//cierre de main
}//cierre de class