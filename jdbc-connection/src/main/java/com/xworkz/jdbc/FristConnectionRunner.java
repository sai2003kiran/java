package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FristConnectionRunner {
    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","sai2003kiran");
        Statement stmt = conn.createStatement();
        int noOfRowAffected =
                /* to insert=>stmt.executeUpdate("INSERT INTO food_details (food_name, food_type, food_ingredients, food_review, food_spice_level) " +
                        "VALUES " +
                        "('Veg Biryani', 'SouthIndian', 'Rice, Vegetables, Spices', 4, 'High'), " +
                        "('Chole Bhature', 'NorthIndian', 'Chickpeas, Flour, Spices', 4, 'Low')");*/
        // to delete=>stmt.executeUpdate("delete from food_details where id=7");
                stmt.executeUpdate("insert into food_details (food_name, food_type, food_ingredients, food_review, food_spice_level) values('Masala Dosa', 'SouthIndian', 'Rice Batter, Potato, Mustard Seeds', 5, 'Medium'),\n" +
                        "('Hakka Noodles', 'IndoChinese', 'Noodles, Vegetables, Soy Sauce, Garlic', 3, 'High'),\n" +
                        "('Palak Paneer', 'NorthIndian', 'Spinach, Paneer, Garlic, Spices', 5, 'Low'),\n" +
                        "('Manchurian', 'IndoChinese', 'Cabbage, Garlic, Soy Sauce, Corn Flour', 4, 'High'),\n" +
                        "('Idli Sambar', 'SouthIndian', 'Rice Cakes, Lentils, Tamarind, Spices', 5, 'Low'),\n" +
                        "('Rajma Chawal', 'NorthIndian', 'Kidney Beans, Onion, Tomato, Rice', 4, 'Medium'),\n" +
                        "('Fried Rice', 'IndoChinese', 'Rice, Carrot, Beans, Soy Sauce, Pepper', 3, 'Medium')");
        // to update=>stmt.executeUpdate("UPDATE food_details SET food_review = 8, food_spice_level = 'medium' WHERE food_name = 'Paneer Butter Masala' AND food_type = 'NorthIndian'");

        System.out.println(noOfRowAffected);
        stmt.close();
        conn.close();
    }
}
