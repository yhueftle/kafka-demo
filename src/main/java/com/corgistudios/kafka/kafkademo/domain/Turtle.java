package com.corgistudios.kafka.kafkademo.domain;

public class Turtle {

    private String name;
    private String species;

    public Turtle () {

    }

    public Turtle(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Turtle name is: " + getName() + ". And Turtle species is: " + getSpecies();
    }
}
