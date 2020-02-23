package com.java.practise.design.composite;

public class Developer implements Employee {

    private String id;
    private String name;
    private String role;

    public Developer(String id, String name) {
        this.id = id;
        this.name = name;
        this.role = "Developer";
    }

    @Override
    public void showDetails() {
        System.out.println(id + " " + name + " " + role);
    }
}
