package com.java.walmart;

import java.util.*;

class Solution {

    static class Action{
        String name;
        String user;

        long start;

        long end;

        public Action(String name, String user) {
            this.name = name;
            this.user = user;
        }
    }

    class FileIterator implements Iterator<String> {
        public boolean hasNext(){
            return true;
        }
        public String next(){
            return "" ;
        }
    }
    private void collectAllLogs(){
        Map<String, Action> logMap = new HashMap<>();
        FileIterator fileIterator = new FileIterator();
        while (fileIterator.hasNext()){
            identifyActionTimeTaken(fileIterator.next(), logMap);
        }
    }

    private void identifyActionTimeTaken(String line, Map<String, Action> logMap){
        String[] logDetails = line.split("#");
        Action action = new Action(logDetails[2], logDetails[1]);
        String searchKey = action.name+"_"+action.user;
        if (logDetails[3].equals("start")){
            action.start = Long.parseLong(logDetails[0]);
            logMap.put(searchKey, action);
        }else{
            Action existingAction = logMap.remove(searchKey);
            existingAction.end = Long.parseLong(logDetails[0]);
            // Any action you needed to do you can do it here like find top 10 or so
            System.out.println("Action and time diff "+existingAction.name+
                    " Time diff : "+(existingAction.end-existingAction.start));
        }
    }
}
