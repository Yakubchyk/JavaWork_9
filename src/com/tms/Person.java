package com.tms;

public class Person implements Cloneable{

    public String username;
    private String password = "qwertz";

    public String getPassword() {
        return password;
    }

    public Person() {
    }

    public Person(String username, String password) {
        this.username = username;
        this.password = password;

    }
}
