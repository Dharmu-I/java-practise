package com.java.design.state;

public class PlayState extends UserState {
    @Override
    void rewardState() {
        System.out.println("Play more matches to win reward");
    }

    @Override
    void playState() {
        System.out.println("You are not completed the stages yet. Play Again");
    }
}
