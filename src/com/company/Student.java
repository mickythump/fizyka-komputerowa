package com.company;

/**
 * Created by miki on 15.10.15.
 */
public class Student extends Person{
    String kierunek;
    double srednia;

    public Student(String nazw, int wiek, String pesel, String kier, double sred) {
        super(nazw, wiek, pesel);
        kierunek = kier;
        srednia = sred;
    }

    void student_info() {
        printPerson();
        System.out.println("Kierunek: " + kierunek);
        System.out.println("Średnia: " + srednia);
    }
}
