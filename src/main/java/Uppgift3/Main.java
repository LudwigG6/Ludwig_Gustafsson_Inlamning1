package Uppgift3;

public class Main {
    public static void main(String[] args) {
    Person person1 = new Person("2006-01-01");
    Person person2 = new Person("2006-02-02");
    person1.setGatuAdress("Storgatan 1");
    person2.setGatuAdress("Storgatan 2");

    person1.setPostNummer("11111");
    person1.setPostort("Stockholm");
    person2.setPostNummer("22222");
    person2.setPostort("Stockholm");

    person1.setNamn("Ludwig");
    person2.setNamn("Bertil");

        System.out.println("före flytt:");
        System.out.println("Person 1: " + person1.getNamn() + ", " + person1.getGatuAdress() + ", " + person1.getPostNummer() + ", " + person1.getPostort());
        System.out.println("Person 2: " + person2.getNamn() + ", " + person2.getGatuAdress() + ", " + person2.getPostNummer() + ", " + person2.getPostort());

        //Person 1 flyttar in hos person 2
        person1.setGatuAdress(person2.getGatuAdress());
        person1.setPostNummer(person2.getPostNummer());
        person1.setPostort(person2.getPostort());

        System.out.println("efter flytt:");
        System.out.println("Person 1: " + person1.getNamn() + ", " + person1.getGatuAdress() + ", " + person1.getPostNummer() + ", " + person1.getPostort());
        System.out.println("Person 2: " + person2.getNamn() + ", " + person2.getGatuAdress() + ", " + person2.getPostNummer() + ", " + person2.getPostort());

        System.out.println();
    }
}
