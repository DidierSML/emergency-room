package com.example.emergencyroom;

/**
 * Estableceremos una Clase enum: llamada Gravity, mediante
 * la cual estableceremos las prioridades de atención para los
 * pacientes que van ingresando a la Sala de emergencia.
 */
public enum Gravity {

    //Enums
    MINOR("Minor", 1),
    MODERATE("Moderate", 2),
    SEVERE("Sever", 3),
    VERY_SEVER("Very Severe", 4);


    //Atributos
    private String description;
    private Integer level;

    //Constructor privado para estos casos tipo enum
    private Gravity (String description, Integer level){
        this.description = description;
        this.level = level;
    }

    //Getters & Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
