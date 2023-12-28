package com.example.emergencyroom;

public class Patient implements Comparable <Patient> {

    //Atributos
    String name;
    Gravity gravity;

    //Constructor
    public Patient (String name, Gravity gravity){
        this.name = name;
        this.gravity = gravity;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gravity getGravity() {
        return gravity;
    }

    public void setGravity(Gravity gravity) {
        this.gravity = gravity;
    }

    //Implementando la Interfaz Comparable para usar su método -compareTo-
    //El cual establecerá la prioridad comparando objetos del mismo tipo
    //

    @Override
    public int compareTo(Patient patient) {
        int currentLevel = this.gravity.getLevel();//Obtenemos el nivel de gravedad del paciente actual
        int compareLevel = patient.gravity.getLevel();//Paciente con el que queremos comparar

        //El que tenga mayor valor tendrá mayor prioridad
        return compareLevel - currentLevel;
        //Si el paciente actual es SEVERO(3) Y el current es (4) = Nos retornará un entero negativo
    }
    /*
        Se retornará un valor Entero (-) => si el objeto es menor al valor comparado
        Se retornará un valor Entero (0) => sí el objeto es igual al valor comparado
        Se retornará un valor Entero (+) => si el objeto es mayor al valor comparado
     */

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", gravity=" + gravity +
                '}';
    }
}
