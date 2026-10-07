package Uppgift1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dagens Lunchmeny!");
        Matratt m1 = new Matratt("Köttbullar", 50, "Kött", 500);
        Matratt m2 = new Matratt("Pasta", 60, "Vegetarisk", 400);
        Matratt m3 = new Matratt("Kyckling", 70, "Kött", 300);

        ArrayList<Matratt> lunchmeny = new ArrayList<>();
        lunchmeny.add(m1);
        lunchmeny.add(m2);
        lunchmeny.add(m3);

        for (Matratt matratt : lunchmeny) {
            System.out.println(matratt);
        }
    }
}
