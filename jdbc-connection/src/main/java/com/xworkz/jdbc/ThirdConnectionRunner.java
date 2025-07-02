package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ThirdConnectionRunner {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","sai2003kiran");
        Statement stmt = conn.createStatement();
        int noOfRowAffected =
            /*stmt.executeUpdate("insert into player_history(player_name, country, role, batting_style, bowling_style)"
            + "values" +
            "('Virat Kohli', 'India', 'Batsman', 'Right-hand bat', 'Right-arm medium')," +
            "('Babar Azam', 'Pakistan', 'Batsman', 'Right-hand bat', 'None')," +
            "('Steve Smith', 'Australia', 'Batsman', 'Right-hand bat', 'Right-arm leg spin')," +
            "('Ben Stokes', 'England', 'All-Rounder', 'Left-hand bat', 'Right-arm fast-medium')," +
            "('Rashid Khan', 'Afghanistan', 'Bowler', 'Right-hand bat', 'Right-arm leg break')," +
            "('Kane Williamson', 'New Zealand', 'Batsman', 'Right-hand bat', 'Right-arm off break')," +
            "('Jasprit Bumrah', 'India', 'Bowler', 'Right-hand bat', 'Right-arm fast')," +
            "('MS Dhoni', 'India', 'Wicket-Keeper', 'Right-hand bat', 'Right-arm medium')," +
            "('Shaheen Afridi', 'Pakistan', 'Bowler', 'Left-hand bat', 'Left-arm fast')," +
            "('David Warner', 'Australia', 'Batsman', 'Left-hand bat', 'Right-arm leg spin');");*/
                stmt.executeUpdate("update player_history set bowling_style='Right-arm-off spin' where id='2'");
                System.out.println(noOfRowAffected);
        stmt.close();
        conn.close();
    }
}
