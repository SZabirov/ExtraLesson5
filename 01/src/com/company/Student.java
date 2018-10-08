package com.company;

public class Student extends UniversityPerson {
    int course;

    public Student(String firstName, String secondName) {
        super(firstName, secondName);
    }

    void introduceYourself() {
        System.out.println("I am " + firstName + " " + secondName);
    }
}
