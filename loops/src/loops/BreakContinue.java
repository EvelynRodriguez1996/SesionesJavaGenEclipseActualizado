package loops;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Sentencias utilizadas en loops: -- break. Se utiliza para salir de un bucle
		 * en un punto específico -- continue. Interrumpe la iteración de un bucle, si
		 * se produce una específica y continúa con la siguiente
		 */

		// Super ozzito va a realizar una riga en la cual el cliente número 5 se ganará
		// una coca-cola de bolsita

		// Con break finalizando el bucle antes de llegar a la condición final
		for (int cliente = 1; cliente <= 20; cliente++) {
			if (cliente == 5) {
				System.out.println("Cliente número " + cliente + " !GANASTE!");
				break;
			}
			System.out.println("Eres el cliente número " + cliente);
		}

		System.out.println(
				" \n*************************************************************************************** \n");

		// Con continue ejecutando la sentencia condicinal pero cumpliendo la condición
		// del bucle
		for (int cliente = 1; cliente <= 20; cliente++) {
			if (cliente == 5) {
				System.out.println("Cliente número " + cliente + " !GANASTE!");
				continue;
			}
			System.out.println("Eres el cliente número " + cliente);
		}

	}

}