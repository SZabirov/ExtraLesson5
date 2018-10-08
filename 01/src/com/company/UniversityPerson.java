package com.company;

public class UniversityPerson {
    String firstName;
    String secondName;
    String thirdName;
    String passportSeries;
    String passportNumber;
    boolean isAccepted;

    public UniversityPerson(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public UniversityPerson(String passportSeries, String passportNumber, String secondName) {
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.secondName = secondName;
    }

}
