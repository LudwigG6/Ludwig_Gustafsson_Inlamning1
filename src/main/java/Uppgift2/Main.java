package Uppgift2;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("bertil", "Göransson", "KTH", 22);
        Student stu2 = new Student("Kalle", "Karlsson", "SU", 20);
        System.out.println("Student 1: " + stu1.getFornamn() + " " + stu1.getEfternamn() + ", " + stu1.getSkola() + ", " + stu1.getAlder());
        System.out.println("Student 2: " + stu2.getFornamn() + " " + stu2.getEfternamn() + ", " + stu2.getSkola() + ", " + stu2.getAlder());
        System.out.println("använd set-metoderna för att ändra värdena på student 1");
        stu1.setFornamn("Bertil");
        stu1.setEfternamn("Gustafsson");
        stu1.setSkola("SU");
        stu1.setAlder(20);
        System.out.println("Student 1: " + stu1.getFornamn() + " " + stu1.getEfternamn() + ", " + stu1.getSkola() + ", " + stu1.getAlder());
    }
}
