package com.java.design.state;

public class MainClass {

    public static void main(String[] args) {
        User user = new User("Dharmu");
        UserStateManager userStateManager = new UserStateManager();
        UserState userState = userStateManager.getUserState(user);
        System.out.println("\n===== State - 0 ===== \n");
        userState.playState();
        userState.rewardState();

        System.out.println("\n===== State - 1 ===== \n");
        user.incrementWin();
        userState = userStateManager.getUserState(user);
        userState.playState();
        userState.rewardState();

        System.out.println("\n===== State - 2 ===== \n");
        user.incrementWin();
        userState = userStateManager.getUserState(user);
        userState.playState();
        userState.rewardState();

        System.out.println("\n===== State - 3 ===== \n");
        user.incrementWin();
        userState = userStateManager.getUserState(user);
        userState.playState();
        userState.rewardState();
    }
}
