package com.java.design.state;

public class UserStateManager {
    private PlayState playState;
    private RewardState rewardState;

    public UserStateManager() {
        this.playState = new PlayState();
        this.rewardState = new RewardState();
    }

    public UserState getUserState(User user) {
        return (user.getNumberOfWins() == 3) ? this.rewardState : this.playState;
    }
}
