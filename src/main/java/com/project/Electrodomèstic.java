package com.project;

public abstract class Electrodomèstic implements Cloneable {
    protected String nom;
    protected String color;
    protected double preu;
    protected String marca;
    protected String eficiència;

    public Electrodomèstic(String nom, String color, double preu, String marca, String eficiència) {
        this.nom = nom;
        this.color = color;
        this.preu = preu;
        this.marca = marca;
        this.eficiència = eficiència;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Color: " + color + ", Preu: " + preu + ", Marca: " + marca + ", Eficiencia: " + eficiència;
    }
}
