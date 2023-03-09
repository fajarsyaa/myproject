package Inheritance;

public class Employe {
    String nama;
    Employe(String nama){
        this.nama = nama;
    }

    void sayHello(String nama){
        System.out.println("hi "+nama+", my name is "+this.nama+" I am a Employe");
    }
}
