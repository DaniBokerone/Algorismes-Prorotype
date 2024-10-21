package com.project;

public class Forn extends Electrodomèstic {
    private int temperatura;
    private boolean autoneteja;

    public Forn(String nom, String color, double preu, String marca, String eficiència, int temperatura, boolean autoneteja) {
        super(nom, color, preu, marca, eficiència);
        this.temperatura = temperatura;
        this.autoneteja = autoneteja;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", Temperatura: " + temperatura + ", Autoneteja: " + autoneteja;
    }
}
