package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Class.forName;

public class SecondConnectionRunner {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection ok = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","sai2003kiran");
        Statement bye = ok.createStatement();
        int noOfRowAffected=bye.executeUpdate("insert into bike_details(bike_name, bike_branch, engine_capacity, bike_price, bike_mileage)" +
                "values" + "('Splendor Plus', 'Hero', '97.2cc', 75000.00, 60.00)," +
                "('Pulsar 150', 'Bajaj', '149.5cc', 120000.00, 50.00)," +
                "('Apache RTR 160', 'TVS', '159.7cc', 118000.00, 45.00)," +
                "('FZ-S FI', 'Yamaha', '149cc', 125000.00, 48.00)," +
                "('CB Shine', 'Honda', '124cc', 85000.00, 55.00)," +
                "('XPulse 200', 'Hero', '199.6cc', 140000.00, 40.78);");
        bye.close();
        ok.close();
    }
}
