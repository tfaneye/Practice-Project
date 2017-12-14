package com.nopcommerce.demo.database;

import java.sql.*;

/**
 * Created by Tunde on 11/07/2016.
 */
public class DatabaseManager {

    //MysQL Database Connection details
    public static String mySqlDriver = "com.mysql.jdbc.Driver";
    public static String mySqlUsername = "root";
    public static String mySqlPassword = "root";
    public static String databaseName = "automation_testdata";
    public static String mySqlUrl = "jdbc:mysql://localhost:3306/"+databaseName;

    //Create connection string

    private static Connection connection = null;

    public static void startMySqlDatabaseServer(){
        try{
            Class.forName(mySqlDriver).newInstance();
            connection = DriverManager.getConnection(mySqlUrl, mySqlUsername, mySqlPassword);
            if(!connection.isClosed()){
                System.out.println("Successfully connected to MySQL Database!");
            }
        }catch(Exception e){
            System.err.println("Unable to connect to MySQL Database");
        }
    }

    //Method to run any select query
    public static ResultSet runSqlSelectStatement(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
      //  ResultSet resultSet = statement.executeQuery(query);
      //  return resultSet;
    }

    //Method to close Database
    public static void shutMySqlDownDatabaseServer(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Database successfully closed!!");
        }

    }
}
