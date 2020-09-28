package com.java.design.state;

import lombok.Getter;

@Getter
public class User {

    private String name;

    private int numberOfWins;

    public User(String name) {
        this.name = name;
        this.numberOfWins = 0;
    }

    public void incrementWin() {
        this.numberOfWins++;
    }
}
