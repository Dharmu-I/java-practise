package com.java.practise.datacenter;

import java.util.LinkedList;
import java.util.List;

public class DataCenter {

    Integer numberOfRacks;
    Integer rackSize;
    List<Rack> racks = new LinkedList<>();

    public DataCenter(int numberOfRacks, int rackSize){
        this.numberOfRacks = numberOfRacks;
        this.rackSize = rackSize;

        for(int rackNumber = 0; rackNumber < numberOfRacks; rackNumber++){
            racks.add(new Rack(rackSize, rackNumber));
        }
    }

    public void initializeServerStatus(boolean[][] serverUpgradeStatus){
        for(int rackRow = 0; rackRow < rackSize; rackRow++){
            for(int rackNumber = 0; rackNumber < numberOfRacks; rackNumber++){
                racks.get(rackNumber).servers.get(rackRow).isUpgraded = serverUpgradeStatus[rackRow][rackNumber];
            }
        }
    }

    public void displayServerStatus(){
        for(int rackRow = 0; rackRow < rackSize; rackRow++) {
            for (int rackNumber = 0; rackNumber < numberOfRacks; rackNumber++) {
                if(racks.get(rackNumber).servers.get(rackRow).isUpgraded)
                    System.out.print( 1 + "\t");
                else
                    System.out.print( 0 + "\t");
            }
            System.out.println("");
        }
    }

    public boolean[][] getDataCenterCurrentStatus(){
        boolean[][] serverStatus = new boolean[rackSize][numberOfRacks];
        for(int rackRow = 0; rackRow < rackSize; rackRow++) {
            for (int rackNumber = 0; rackNumber < numberOfRacks; rackNumber++) {
                serverStatus[rackRow][rackNumber] = racks.get(rackNumber).servers.get(rackRow).isUpgraded;
            }
        }
        return serverStatus;
    }

    public DataCenter selfServerStatusUpgrade(){
        DataCenter newDataCenter = new DataCenter(numberOfRacks, rackSize);
        newDataCenter.initializeServerStatus(this.getDataCenterCurrentStatus());
        for(int rackRow = 0; rackRow < rackSize; rackRow++) {
            for (int rackNumber = 0; rackNumber < numberOfRacks; rackNumber++) {
                if(racks.get(rackNumber).servers.get(rackRow).isUpgraded == true){
                    if(rackNumber + 1 < numberOfRacks)
                        newDataCenter.racks.get(rackNumber + 1).servers.get(rackRow).isUpgraded = true;
                    if(rackNumber - 1 >= 0)
                        newDataCenter.racks.get(rackNumber - 1).servers.get(rackRow).isUpgraded = true;
                    if(rackRow + 1 < rackSize)
                        newDataCenter.racks.get(rackNumber).servers.get(rackRow + 1).isUpgraded = true;
                    if(rackRow -1 >= 0)
                        newDataCenter.racks.get(rackNumber).servers.get(rackRow -1).isUpgraded = true;
                }
            }
        }
        return newDataCenter;
    }

    public boolean isAllServersUpgraded(){
        for(int rackRow = 0; rackRow < rackSize; rackRow++) {
            for (int rackNumber = 0; rackNumber < numberOfRacks; rackNumber++) {
                if(racks.get(rackNumber).servers.get(rackRow).isUpgraded == false)
                    return false;
            }
        }
        return true;
    }

    class Rack {
        List<Server> servers = new LinkedList<>();
        Integer rackSize;
        Integer rackNumber;

        public Rack(int rackSize, int rackNumber){
            this.rackSize = rackSize;
            this.rackNumber = rackNumber;
            for(int rackRow = 0; rackRow < rackSize; rackRow++){
                servers.add(new Server(new Server.Location(rackNumber, rackRow)));
            }
        }
    }
}
