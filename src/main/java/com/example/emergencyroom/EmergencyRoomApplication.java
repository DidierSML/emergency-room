package com.example.emergencyroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

@SpringBootApplication
public class EmergencyRoomApplication {

	//Lista de Pacientes Ingresados
	public static List<Patient> listOfPatients (){
		return Arrays.asList(
			new Patient("Juan", Gravity.MINOR),
			new Patient("Paco", Gravity.SEVERE),
			new Patient("Yuliana", Gravity.MODERATE),
			new Patient("Ximena", Gravity.MINOR),
			new Patient("Eugenio", Gravity.VERY_SEVER),
			new Patient("Filemon", Gravity.VERY_SEVER),
			new Patient("Horacio", Gravity.SEVERE),
			new Patient("Milena", Gravity.MINOR),
			new Patient("Raquel", Gravity.SEVERE),
			new Patient("Estrella", Gravity.MINOR)
		);
	}

	public static void main(String[] args) {
		SpringApplication.run(EmergencyRoomApplication.class, args);

		Queue<Patient> attentionPriority = new PriorityQueue<>(listOfPatients());

		//Obtenemos el tamaño de la cola
		int numOfPatients = attentionPriority.size();

		for(int i = 0; i < numOfPatients; i++){
			Patient attendingPatient = attentionPriority.poll();//Obtenemos los datos por prioridad
			String name = attendingPatient.getName();//Obtenemos el nombre
			String gravity = attendingPatient.getGravity().getDescription();//Obtenemos la gravedad
			System.out.println("Atendiendo al paciente: " + name + " con Gravedad: " + gravity);
		}
	}

}

/*
	OUTPUT:
	Atendiendo al paciente: Eugenio con Gravedad: Very Severe
	Atendiendo al paciente: Filemon con Gravedad: Very Severe
	Atendiendo al paciente: Raquel con Gravedad: Sever
	Atendiendo al paciente: Paco con Gravedad: Sever
	Atendiendo al paciente: Horacio con Gravedad: Sever
	Atendiendo al paciente: Yuliana con Gravedad: Moderate
	Atendiendo al paciente: Ximena con Gravedad: Minor
	Atendiendo al paciente: Juan con Gravedad: Minor
	Atendiendo al paciente: Estrella con Gravedad: Minor
	Atendiendo al paciente: Milena con Gravedad: Minor

 */