package com.java.practise.other.connectionpool;

import java.util.Hashtable;

public abstract class ConnectionObjectPool {

    private long expireTime;
    private Hashtable<Object, Long> availableConnectionPool;
    private Hashtable<Object, Long> usedConnectionPool;

    ConnectionObjectPool(){
        this.expireTime = 30000;
        this.availableConnectionPool = new Hashtable<>();
        this.usedConnectionPool = new Hashtable<>();
    }

    abstract Object create();

    abstract boolean validate(Object o);

    abstract void expire(Object o);

    synchronized Object getConnection(){
        long now = System.currentTimeMillis();
        if (!availableConnectionPool.isEmpty()){
            for (Object object : availableConnectionPool.keySet()){
                if (now - availableConnectionPool.get(object) > this.expireTime){
                    availableConnectionPool.remove(object);
                    expire(object);
                }else {
                    if (validate(object)) {
                        usedConnectionPool.put(object, availableConnectionPool.get(object));
                        availableConnectionPool.remove(object);
                        return object;
                    }else {
                        usedConnectionPool.remove(object);
                        expire(object);
                    }
                }
            }
        }
        Object o = create();
        usedConnectionPool.put(o, now);
        return o;
    }

    synchronized void returnTheConnection(Object object){
        availableConnectionPool.put(object, usedConnectionPool.get(object));
        usedConnectionPool.remove(object);
    }

}
