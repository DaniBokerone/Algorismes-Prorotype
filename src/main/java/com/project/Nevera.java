package com.project;

public class Nevera extends Electrodomèstic {
    private int frigories;
    private int soroll;

    public Nevera(String nom, String color, double preu, String marca, String eficiència, int frigories, int soroll) {
        super(nom, color, preu, marca, eficiència);
        this.frigories = frigories;
        this.soroll = soroll;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", Frigories: " + frigories + ", Soroll: " + soroll;
    }
}
