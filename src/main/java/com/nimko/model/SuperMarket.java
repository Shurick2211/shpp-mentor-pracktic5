package com.nimko.model;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
    private final List<Person> people;
    private static SuperMarket superMarket;

    private SuperMarket() {
        people = new ArrayList<>();
    }

    public static SuperMarket getInstance(){
        return superMarket == null ? superMarket = new SuperMarket(): superMarket;
    }

    public void addPerson(Person person){
        people.add(person);
    }

    public List<Person> getPeople() {
        return people;
    }

}
