package com.company;

public class Main {

    public static void main(String[] args) {
        Person osoba = new Person("Maciejewski", 21, "12312312312");
        Student student = new Student("Nowak", 22, "123321", "Technologie komputerowe", 3.00);

        osoba.printPerson();
        student.student_info();
    }
}
