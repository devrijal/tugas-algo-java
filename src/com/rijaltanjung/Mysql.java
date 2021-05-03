package com.rijaltanjung;

import java.sql.*;

import com.mysql.cj.jdbc.MysqlDataSource;

public class Mysql {

    private MysqlDataSource dsnSource()
    {
        System.out.println("Configuring database connection to DB mahasiswa...");
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName("localhost");
        dataSource.setUser("root");
        dataSource.setPassword("");
        dataSource.setDatabaseName("mahasiswa");
        return dataSource;
    }

    public static void main(String[] args) {
        MysqlDataSource dsnSource = new Mysql().dsnSource();

        try {
            System.out.println("Connecting to DB mahasiswa using root@localhost ...");
            Connection conn = dsnSource.getConnection();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT DATABASE() AS DB");
            while (resultSet.next()) {
                System.out.printf("Connected to DB %s.", resultSet.getString("DB"));
            }

            System.out.println();
            System.out.println("Disconnecting database connection...");
            resultSet.close();
            statement.close();
            conn.close();
            System.out.println("Database disconnected");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
