package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * While. El ciclo While ejecuta continuamente un bloque de código hasta que se
		 * cumpla una condición dada. While (expresion){ //bloque de código a ejecutar
		 * (contador - iterador) }
		 */

		/*
		 * int cuenta = 1; while(cuenta < 11) { System.out.println("la cuenta es de: " +
		 * cuenta); cuenta ++; }
		 */

		int cuenta = 0;
		while (cuenta < 10) {
			cuenta++;
			System.out.println("la cuenta es de: " + cuenta);
		}

		/*
		 * Crear un programa que solicite al usuario un número. Dicho número será tomado
		 * como el número final de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en
		 * consola la cuenta del 1 hasta el número proporcionado. 1. Importar un scanner
		 * e implementarlo 2. Un mensaje para darale contexto al usuario 3. Almacenar el
		 * número del usuario en una variable. 4. Guardar en variable el número que
		 * inicia la cuenta (1) 5. Implementar un ciclo while. 6. Mostrar por consola el
		 * resultado
		 */

		// 1. Importar el scanner
		Scanner scanner = new Scanner(System.in);
		// 2. Un mensaje para darale contexto al usuario
		System.out.println("Escribe un número que servirá como número final de una cuenta");
		// 3. Almacenar el número del usuario en una variable.
		int numFinal = scanner.nextInt();
		// 4. Guardar en variable el número que inicia la cuenta (1)
		int numInicial = 1;
		// 5. Implementar un ciclo while.

		while (numInicial <= numFinal) {
			// 6. Mostrar por consola el resultado
			System.out.println("La cuenta va en " + numInicial);
			numInicial++;
		}

		scanner.close();

	}
}