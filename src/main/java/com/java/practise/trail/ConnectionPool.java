package com.java.practise.trail;

import java.sql.*;

public class ConnectionPool extends ObjectPool {

    private String uri;
    private String userName;
    private String password;

    ConnectionPool(String driver, String uri, String userName, String password){
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.uri = uri;
        this.password = password;
        this.userName = userName;
    }

    @Override
    Object create() {
        try {
            return DriverManager.getConnection(this.uri, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    boolean validate(Object object) {
        try {
            return !((Connection)object).isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Boolean.FALSE;
    }

    @Override
    void close(Object object) {
        try {
            ((Connection)object).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection borrowConnection(){
        return (Connection) super.getConnection();
    }

    public void returnConnection(Connection connection){
        super.returnConnection(connection);
    }

    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool("com.mysql.jdbc.Driver","jdbc:mysql://127.0.0.1:3306",
                "root","root#123");
        Connection connection = (Connection) connectionPool.getConnection();
        System.out.println(connection);
        connectionPool.returnConnection(connection);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        connection = (Connection) connectionPool.getConnection();
        System.out.println(connection);
        connectionPool.returnConnection(connection);
    }

}
