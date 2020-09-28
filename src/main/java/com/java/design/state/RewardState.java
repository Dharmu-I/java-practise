package com.java.design.state;

public class RewardState extends UserState {
    @Override
    void rewardState() {
        System.out.println("You won 100 coins");
    }

    @Override
    void playState() {
        System.out.println("Today's play is over");
    }
}
