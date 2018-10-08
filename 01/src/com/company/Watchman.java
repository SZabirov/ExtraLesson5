package com.company;

public class Watchman {
    boolean acceptPerson(UniversityPerson universityPerson) {
        if (universityPerson.isAccepted) {
            System.out.println("You're lucky one!");
            return true;
        } else {
            System.out.println("Ha-ha");
            return false;
        }
    }
}
