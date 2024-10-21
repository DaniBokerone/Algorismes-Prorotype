package com.project;

public class Rentadora extends Electrodomèstic {
    private int revolucions;
    private int soroll;

    public Rentadora(String nom, String color, double preu, String marca, String eficiència, int revolucions, int soroll) {
        super(nom, color, preu, marca, eficiència);
        this.revolucions = revolucions;
        this.soroll = soroll;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", Revolucions: " + revolucions + ", Soroll: " + soroll;
    }
}
