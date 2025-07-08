package com.xworkz.jdbc.repository.imple;

import com.xworkz.jdbc.dto.UserDto;
import com.xworkz.jdbc.repository.UserRepositoy;

import java.sql.*;

public class UserRepoImple implements UserRepositoy {
    @Override
    public boolean save(UserDto dto){
        boolean details=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","sai2003kiran");
//            Statement stmt = conn.createStatement();
//            int noOfRowAffected = stmt.executeUpdate("insert into bank_details(name, bank_type, address) values('"+dto.getAccountName()+"'," +
//                   "'"+dto.getAccountType()+"'," +
//                    "'"+dto.getAddress()+"')");
            String insert ="insert into bank_details(name,bank_type, address) values(?,?,?)";
            PreparedStatement ptmt = conn.prepareStatement(insert);
            ptmt.setString(1,dto.getAccountName());
            ptmt.setString(2, dto.getAccountType());
            ptmt.setString(3, dto.getAddress());
            int noOfRowAffected = ptmt.executeUpdate();
            if (noOfRowAffected > 0) {
                details=true;
            }
            ptmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return details;
    }

    @Override
    public boolean update(int id, String bType) {
        boolean upd = false;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","sai2003kiran");
            String update ="update bank_details set bank_type=? where bank_id=?";
            PreparedStatement ptmt = conn.prepareStatement(update);
            ptmt.setString(1,bType);
            ptmt.setInt(2,id);
            int row = ptmt.executeUpdate();
            if (row > 0) {
                upd = true;
            }
            ptmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return upd;
    }

    @Override
    public boolean delete(int id) {
        boolean del = false;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","sai2003kiran");
            String delete ="delete from bank_details where bank_id=?";
            PreparedStatement ptmt = conn.prepareStatement(delete);
            ptmt.setInt(1,id);
            int row = ptmt.executeUpdate();
            if (row > 0) {
                del = true;
            }
            ptmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return del;
    }
}
