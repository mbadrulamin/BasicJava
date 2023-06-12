package com.company;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

import java.sql.*;

public class Main {

    static private DBHandler dbHandler;
    static private Connection connection;
    static private PreparedStatement preparedStatement;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Create Database connection

//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "root");
//        System.out.println("Connected to the database " + connection.getCatalog());


        dbHandler = new DBHandler();
        connection = dbHandler.getDbConnection();

        //writeToDB();
        //readFromDB();
        //updateDB("Carlos","Santana", "santana", "1343 south", 43, 1);
        deleteUser(1);

    }

    public static void writeToDB() throws SQLException {
        String insert = "INSERT INTO users(firstname,lastname,username,address,age)" + "VALUES(?,?,?,?,?)";

        preparedStatement = connection.prepareStatement(insert);

        preparedStatement.setString(1,"Ricardo");
        preparedStatement.setString(2,"John");
        preparedStatement.setString(3,"rico");
        preparedStatement.setString(4,"1234 South Asia");
        preparedStatement.setInt(5,21);
        preparedStatement.executeUpdate();

    }

    public static void readFromDB() throws SQLException{

        String query = "SELECT * from users";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println("Names: " + resultSet.getString("firstname") + " " + resultSet.getString("lastname") + " " + resultSet.getInt("age") + " " + resultSet.getString("address"));
        }
    }

    public static void updateDB(String firstname, String lastname, String username, String address, int age, int id){

        String query = "UPDATE users SET firstname = ?, lastname = ?, username = ?, address = ?, age = ?" + " where userid = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, address);
            preparedStatement.setInt(5, age);
            preparedStatement.setInt(6, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void deleteUser(int id){

        String query = "DELETE FROM users where userid = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
