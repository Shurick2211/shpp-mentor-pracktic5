package com.nimko.model;

import com.nimko.role.Role;

public class Person {
    private String name;
    private Role role;

    private Person() {}

    public String sayHello(){
        return role == null ? "Я "+ name :"Я " + name + role.roleSpeak();
    }
    public String sayGoodBay(){
        return "Я " + name + ". Пока-пока!";
    }

    public Role getRole() {
        return role;
    }

    public static class Builder{
        private final Person person;
        public Builder(){
            person = new Person();
        }

        public Builder name(String name){
            person.name = name;
            return this;
        }

        public Builder role(Role role){
            person.role = role;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}
