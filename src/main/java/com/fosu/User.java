package com.fosu;

public class User {
    private int id;
    private String name;
    private String address;

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
