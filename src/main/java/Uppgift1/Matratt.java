package Uppgift1;

public class Matratt {
    public String namn;
    public int pris;
    public String typ;
    public int kalorier;

    public Matratt(String namn, int pris, String typ, int kalorier) {
        this.namn = namn;
        this.pris = pris;
        this.typ = typ;
        this.kalorier = kalorier;
    }
    @Override
    public String toString() {
        return "Matratt " +
                "namn='" + namn + '\'' +
                ", pris=" + pris +
                ", typ='" + typ + '\'' +
                ", kalorier=" + kalorier +
                ' ';
    }
}