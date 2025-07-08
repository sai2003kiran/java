package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionRunner {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_intern","root","sai2003kiran");
        Statement statement = connection.createStatement();
        int noOfRowAffected = statement.executeUpdate("insert into new_table(name) values('suma')");
        System.out.println(noOfRowAffected);
        statement.close();
        connection.close();
    }
}
