package com.java.practise.trail;

import java.util.Hashtable;

public abstract class ObjectPool {

    private long maxConnectionTime;
    private Hashtable<Object, Long> openConnections;
    private Hashtable<Object, Long> usedConnections;

    ObjectPool(){
        this.maxConnectionTime = 30000;
        this.openConnections = new Hashtable<>();
        this.usedConnections = new Hashtable<>();
    }

    abstract Object create();

    abstract boolean validate(Object object);

    abstract void close(Object object);

    synchronized Object getConnection(){
        if (!openConnections.isEmpty()){
            long currentTime = System.currentTimeMillis();
            for (Object object : openConnections.keySet()){
                if (currentTime - openConnections.get(object) > this.maxConnectionTime){
                    close(object);
                    openConnections.remove(object);
                }else {
                    if (validate(object)){
                        usedConnections.put(object, openConnections.get(object));
                        openConnections.remove(object);
                        return object;
                    }else {
                        openConnections.remove(object);
                        close(object);
                    }
                }
            }
        }
        Object object = create();
        usedConnections.put(object, System.currentTimeMillis());
        return object;
    }

    synchronized void returnConnection(Object object){
        openConnections.put(object, usedConnections.get(object));
        usedConnections.remove(object);
    }
}
