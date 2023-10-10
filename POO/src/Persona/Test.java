package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	//Método principal para instanciar mis clases
	public static void main(String[] args) {
		
		//Instancia de Persona
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com");
		System.out.println(Felipe);
		Felipe.imprimirInfo();
		Felipe.saludar();
		
		
		System.out.println("**********************");
		
		
		//Instancia de Dentista
		Dentista Simi = new Dentista("Dr. Simi", "Lares", (byte)50, "1234567890", "simi@lares.com", "Odontología", "1544385", "Consultorio B5", "avanzado", "matutino", 500);
		Simi.calcularSalario();
		//Simi.imprimirInfoDentista();
		
		
		System.out.println("**********************");
		
		
		//Instancia de Paciente con todos los datos
		Paciente Chencho = new Paciente("CHNCH1234", "RH Positivo", true, true, "05/Oct/2023", "Doc. Simi Lares", false);
		System.out.println(Chencho);
		
		
		//instancia de Pacientes con datos obligatorios
		Paciente Masiosare = new Paciente("MAS12345", false, false);
		System.out.println(Masiosare);
		
		//Cambiar el false de seguroMedico a true
//		Masiosare.seguroGastosMedicos = true;
		System.out.println(Masiosare);
		
		
		
		//implementacion de Arraylist de Dentistas
		List<Dentista> listaDentistaArrayList = new ArrayList<>();
		
		Dentista chapatin = new Dentista("Dr chapatin", "Chespirito", (byte)45, "1321321", "correo", "Odontologia", "55465464", "Consultorio 500", "Avanzado", "Matutino", 500);
		
		//Hago una instancia y la agrego directamente a la lista
		listaDentistaArrayList.add(new Dentista("Dr Simi", "Lares", (byte)45, "1321321", "correo", "Odontologia", "55465464", "Consultorio 500", "Avanzado", "Matutino", 500));
		
		
		//Implementacion de la lista de Dentistas con un HashSet
		Set<Dentista> conjuntoDentistas = new HashSet<>();
		
		
		//Agregando Dentista a mi Connjunto
		conjuntoDentistas.add(new Dentista("Dr chapatin", "Chespirito", (byte)45, "1321321", "correo", "Odontologia", "55465464", "Consultorio 500", "Avanzado", "Matutino", 500));
		
		
		
		
		//Implementacion de un hashmap de Dentistas
		Map<String, Dentista> mapaDentistas = new HashMap<>();
		
		//Agregar un dentista a mi mapa
		mapaDentistas.put("Dr House", new Dentista("Gregory", "House", (byte)45, "1321321", "correo", "Odontologia", "55465464", "Consultorio 500", "Avanzado", "Matutino", 1400));
		
		
		
		
		
		
	}//Cierre método main

}//Cierre class persona