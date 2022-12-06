package com.nimko.model;

import com.nimko.role.Role;

public class Man {
    private String name;
    private Role role;

    private Man() {}

    public String say(){
        return role == null ? "Я "+ name :"Я " + name + role.roleSpeak();
    }

    public Role getRole() {
        return role;
    }

    public static class Builder{
        private final Man man;
        public Builder(){
            man = new Man();
        }

        public Builder name(String name){
            man.name = name;
            return this;
        }

        public Builder role(Role role){
            man.role = role;
            return this;
        }

        public Man build(){
            return man;
        }
    }
}
