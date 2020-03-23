package com.java.practise.datacenter;

public class DataCenterMachineUpgrade {

    private static int timeToUpgradeTheOs(int[][] dataCenter) {
        Machine[][] machines = new Machine[5][5];
        machineInitialisation(dataCenter, machines);
        int sum = 0;
        int count = 0;
        while (sum != 25) {
            sum = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (machines[i][j].currentState) {
                        machines[i][j].prevState = true;
                        sum++;
                    } else if ((i - 1 >= 0 && machines[i - 1][j].prevState) ||
                            (j - 1 >= 0 && machines[i][j - 1].prevState) ||
                            (i + 1 < 5 && machines[i + 1][j].prevState) ||
                            (j + 1 < 5 && machines[i][j + 1].prevState)) {
                        machines[i][j].currentState = true;
                        sum++;
                    }
                }
            }
            display(machines);
            count++;
        }
        return count;
    }

    private static void machineInitialisation(int[][] dataCenter, Machine[][] machines) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                machines[i][j] = new Machine(dataCenter[i][j]);
            }
        }
    }

    private static void display(Machine[][] machines){
        System.out.println("=======Start=======");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(machines[i][j].currentState+"\t");
            }
            System.out.println();
        }
        System.out.println("========End========");
    }

    public static void main(String[] args) {
        int[][] dataCenter = {
                {1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
        };
        System.out.println(timeToUpgradeTheOs(dataCenter));
    }
}

class Machine {

    boolean prevState;

    boolean currentState;

    public Machine(int state) {
        if (state == 1) {
            this.prevState = true;
            this.currentState = true;
        } else {
            this.prevState = false;
            this.currentState = false;
        }
    }
}
