package com.java.practise.datacenter;

public class Server {

    Location location;
    Boolean isUpgraded;

    public Server(Location location){
        this.location = location;
        isUpgraded = false;
    }

    static class Location {
        int rackNumber;
        int rackRow;

        public Location(int rackNumber, int rackRow){
            this.rackNumber = 0;
            this.rackRow = 0;
        }
    }
}
