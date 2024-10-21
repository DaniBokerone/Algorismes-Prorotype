package com.project;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Electrodomèstic> llista = new ArrayList<>();
        List<Electrodomèstic> llistaClonada = new ArrayList<>();

        // Crear inst. de Rentadora
        Rentadora rentadora1 = new Rentadora("Rentadora A", "Blau", 500.0, "Marca A", "A++", 1200, 70);
        Rentadora rentadora2 = new Rentadora("Rentadora B", "Groc", 450.0, "Marca B", "A+", 1400, 68);
        llista.add(rentadora1);
        llista.add(rentadora2);

        // Crear inst. de Nevera
        Nevera nevera1 = new Nevera("Nevera A", "Blanc", 800.0, "Marca C", "A++", 300, 50);
        Nevera nevera2 = new Nevera("Nevera B", "Negre", 750.0, "Marca D", "A+", 320, 45);
        llista.add(nevera1);
        llista.add(nevera2);

        // Crear inst. de Forn
        Forn forn1 = new Forn("Forn A", "Blanc", 600.0, "Marca E", "A++", 220, true);
        Forn forn2 = new Forn("Forn B", "Negre", 580.0, "Marca F", "A+", 200, false);
        llista.add(forn1);
        llista.add(forn2);

        // Clonacio de la llista
        for (Electrodomèstic obj : llista) {
            try {
                llistaClonada.add((Electrodomèstic) obj.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

        //Realiztzar comparacions
        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }
        System.out.println("\n");

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaClonada.get(i));
        }
        System.out.println("\n");

    }

    static void compare(int i, Electrodomèstic a, Electrodomèstic b) {
        if (a == b) {
            System.out.println(i + ": Els electrodomèstics són el mateix objecte");
        } else {
            System.out.print(i + ": Els electrodomèstics són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els electrodomèstics són idèntics");
            } else {
                System.out.println(i + ": Els electrodomèstics NO són idèntics");
            }
        }
    }
}
