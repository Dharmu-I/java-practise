package com.java.practise.datacenter;

public class ServerSoftwareUpgrader {
    public static void main(String[] args) {
        int numberOfRacks = 5;
        int rackSize = 5;
        boolean[][] serverInitialUpgradeStatus = new boolean[rackSize][numberOfRacks];
        serverInitialUpgradeStatus[0][0] = true;
        serverInitialUpgradeStatus[3][2] = true;
        serverInitialUpgradeStatus[2][3] = true;
        DataCenter dataCenter = new DataCenter(numberOfRacks, rackSize);
        dataCenter.initializeServerStatus(serverInitialUpgradeStatus);
        dataCenter.displayServerStatus();

        System.out.println("========");
        int numberOfDays = 0;
        while(!dataCenter.isAllServersUpgraded()){
            DataCenter newDC = dataCenter.selfServerStatusUpgrade();
            newDC.displayServerStatus();
            numberOfDays++;
            System.out.println("========");
            dataCenter = newDC;
        }

        System.out.println("Number of days needed to upgrade all servers : " + numberOfDays);

    }
}
