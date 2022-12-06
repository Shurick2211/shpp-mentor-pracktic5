package com.nimko.model;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
    private final List<Man> people;
    private static SuperMarket superMarket;

    private SuperMarket() {
        people = new ArrayList<>();
    }

    public static SuperMarket getInstance(){
        return superMarket == null ? superMarket = new SuperMarket(): superMarket;
    }

    public void addPerson(Man man){
        people.add(man);
    }

    public List<Man> getPeople() {
        return people;
    }

}
