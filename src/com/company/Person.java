package com.company;

/**
 * Created by miki on 15.10.15.
 */

public class Person {
    String nazwisko;
    int wiek;
    String pesel;

    public Person(String n, int w, String p) {
        nazwisko=n;
        wiek=w;
        pesel=p;
    }

    void printPerson() {
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("PESEL: " + pesel);
    }
}
