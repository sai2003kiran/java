package com.xworkz.movie.repository.imple;

import com.mysql.cj.jdbc.Driver;
import com.xworkz.movie.dto.UserDto;
import com.xworkz.movie.repository.UserRepository;

import java.sql.*;

public class UserRepoImple implements UserRepository {
    @Override
    public boolean save(UserDto dto) {
        boolean details=false;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","sai2003kiran");
            String insert = "insert into movie_details(movie_name, movie_langauage, movie_status, movie_rating) values(?,?,?,?)";
            PreparedStatement ptmt = conn.prepareStatement(insert);
            ptmt.setString(1, dto.getName());
            ptmt.setString(2,dto.getLang());
            ptmt.setString(3, dto.getStatus());
            ptmt.setString(4, dto.getRating());
            int noOfRowAffected = ptmt.executeUpdate();
            if (noOfRowAffected > 0) {
                details=true;
            }
            ptmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return details;
    }

    @Override
    public boolean update(String name, String lang) {
        boolean updTable = false;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","sai2003kiran");
            String changes = "update movie_details set movie_langauage=? where movie_name=?";
            PreparedStatement ptmt = conn.prepareStatement(changes);
            ptmt.setString(1,lang);
            ptmt.setString(2,name);
            int noOfRow = ptmt.executeUpdate();
            if (noOfRow>0) {
                updTable=true;
            }
            ptmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updTable;
    }


    @Override
    public boolean delete(int id) {
        boolean delTable = false;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","sai2003kiran");
            String remove = "delete from movie_details where id=?";
            PreparedStatement ptmt = conn.prepareStatement(remove);
            ptmt.setInt(1,id);
            int noOfRow = ptmt.executeUpdate();
            if (noOfRow>0) {
                delTable=true;
            }
            ptmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return delTable;
    }

    @Override
    public UserDto fetch(int id) {
        UserDto fetchData = new UserDto();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","sai2003kiran");
            PreparedStatement ptmt = conn.prepareStatement("select * from movie_details where id=?");
            ptmt.setInt(1,id);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()){
                fetchData.setId(rs.getInt(1));
                fetchData.setName(rs.getString(2));
                fetchData.setLang(rs.getString(3));
                fetchData.setStatus(rs.getString(4));
                fetchData.setRating(rs.getString(5));
            }
            ptmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fetchData;
    }
}
