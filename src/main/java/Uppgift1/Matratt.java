package Uppgift1;

public class Matratt {
    public String namn;
    public int pris;
    public String type;
    public int kalorier;

    public Matratt(String namn, int pris, String type, int kalorier) {
        this.namn = namn;
        this.pris = pris;
        this.type = type;
        this.kalorier = kalorier;
    }
    @Override
    public String toString() {
        return "Matratt " +
                "namn='" + namn + '\'' +
                ", pris=" + pris +
                ", type='" + type + '\'' +
                ", kalorier=" + kalorier +
                ' ';
    }
}