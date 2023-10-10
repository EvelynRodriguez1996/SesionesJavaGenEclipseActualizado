package dataTypes;
import java.lang.Double;
public class DatosPrimitivos {
  public static void main(String[] args) {
	/*
	 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
	 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
	 */
	
	//BYTE Vmin y Vmax
	  byte minByte = Byte.MIN_VALUE;
	  byte maxByte = Byte.MAX_VALUE;
	  System.out.println("El valor minimo de byte es " + minByte);
	  System.out.println("El valor máximo de byte es " + maxByte);
	
	
	//short Vmin y Vmax
	  short minShort = Short.MIN_VALUE;
	  short maxShort = Short.MAX_VALUE;
	  System.out.println("El valor minimo de short es " + minShort);
	  System.out.println("El valor máximo de short es " + maxShort);
	
	//char Vmin y Vmax
	  char minChar = Character.MIN_VALUE;
	  char maxChar = Character.MAX_VALUE;
	  System.out.println("El valor minimo de Character es " + minChar);
	  System.out.println("El valor máximo de Character es " + maxChar);
	  
	  //long
	  long isbn = 9784991699019L;
	  System.out.println(isbn);
	  
	  //float
	  float salary = 15000f;
	  System.out.println(salary);
	  
	  //double
	  double ISR = 1239.45d;
	  System.out.println(ISR);
	  
	  //int Vmin y Vmax
	  int minInt = Integer.MIN_VALUE;
	  int maxInt = Integer.MAX_VALUE;
	  System.out.println("El valor minimo de Int es " + minInt);
	  System.out.println("El valor máximo de Int es " + maxInt);
	  
	  //long Vmin y Vmax
	  long minLong = Long.MIN_VALUE;
	  long maxLong = Long.MAX_VALUE;
	  System.out.println("El valor minimo de long es " + minLong);
	  System.out.println("El valor máximo de long es " + maxLong);
	  
	  //float Vmin y Vmax
	  float minFloat = Float.MIN_VALUE;
	  float maxFloat = Float.MAX_VALUE;
	  System.out.println("El valor minimo de long es " + minFloat);
	  System.out.println("El valor máximo de long es " + maxFloat);
	  
	  //double Vmin y Vmax
	  double minDouble = Double.MIN_VALUE;
	  double maxDouble = Double.MAX_VALUE;
	  System.out.println("El valor minimo de double es " + minDouble);
	  System.out.println("El valor máximo de double es " + maxDouble);
	  
	  char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		/*Casteo: conversión de tipos en JAVA
		 * --Automatico (dato mas pequeño a dato mas grande)
		 * --Manual (tipo de dato mas grande a dato mas pequeño)
		 * */
		
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		//--Manual
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		
		//convertir de float a int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		//conversion
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		
		//convertir de char a int
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
		
}//Cierre de main

}//Cierre de class