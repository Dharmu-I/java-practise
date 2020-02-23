package com.java.practise.design.composite;

public class Manager implements Employee {
    private String id;
    private String name;
    private String role;

    public Manager(String id, String name) {
        this.id = id;
        this.name = name;
        this.role = "Manager";
    }

    @Override
    public void showDetails() {
        System.out.println(id + " " + name + " " + role);
    }
}
