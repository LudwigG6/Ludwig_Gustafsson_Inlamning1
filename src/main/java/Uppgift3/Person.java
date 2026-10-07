package Uppgift3;

public class Person {
    private String fodelsedatum;
    private String namn;
    private String gatuAdress;
    private String postNummer;
    private String postort;

    public Person(String fodelsedatum){
        this.fodelsedatum = fodelsedatum;
    }

    public String getNamn() {
        return namn;
    }

    public String getGatuAdress() {
        return gatuAdress;
    }

    public String getPostNummer() {
        return postNummer;
    }

    public String getPostort() {
        return postort;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setGatuAdress(String gatuAdress) {
        this.gatuAdress = gatuAdress;
    }
}
