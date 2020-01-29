package com.java.practise.other;


import java.sql.*;

public class ConnectionPoolNew extends ConnectionObjectPool {

    private String user;
    private String password;
    private String dataSourceName;

    public ConnectionPoolNew(String user, String password, String dataSourceName, String driver) {
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.user = user;
        this.password = password;
        this.dataSourceName = dataSourceName;
    }

    @Override
    Object create() {
        try {
            return DriverManager.getConnection(dataSourceName,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    boolean validate(Object o) {
        try {
            return ((Connection)o).isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    void expire(Object o) {
        try {
            ((Connection)o).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Connection borrowConnection(){
        return (Connection) super.getConnection();
    }

    public void returnConnection(Connection c){
        super.returnTheConnection(c);
    }

    public static void main(String[] args) {
        ConnectionPoolNew connectionPoolNew =
                new ConnectionPoolNew("root", "root#123",
                        "jdbc:mysql://127.0.0.1:3306","com.mysql.jdbc.Driver");
        connectionPoolNew.borrowConnection();
    }
}
