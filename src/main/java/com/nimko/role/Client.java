package com.nimko.role;

public class Client implements Role{
    @Override
    public String roleSpeak() {
        return " покупець. Хочу купувати!";
    }
}
