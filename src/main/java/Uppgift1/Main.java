package Uppgift1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dagens Lunchmeny!");
        Matratt m1 = new Matratt("Köttbullar", 50, "Kött", 500);
        Matratt m2 = new Matratt("Pasta", 60, "Vegetarisk", 400);
        Matratt m3 = new Matratt("Kyckling", 70, "Kött", 300);

        System.out.println(m1);
    }
}
