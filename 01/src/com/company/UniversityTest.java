package com.company;

public class UniversityTest {
    public static void main(String[] args) {
        UniversityPerson s = new Student("Petya", "Petrov");
        ((Student) s).introduceYourself();
        Watchman w = new Watchman();
        w.acceptPerson(s);
//        Teacher t = new Teacher();

    }
}






