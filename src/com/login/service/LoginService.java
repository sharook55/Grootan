package com.login.service;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.login.constant.Query;
import com.login.exception.ExceptionCode;
import com.login.exception.LoginException;
import com.login.model.Login;

public class LoginService {
    
    public long create(Login login) {
        
        
        try (PreparedStatement ps = ConnectionService.get().prepareStatement(Query.create, PreparedStatement.RETURN_GENERATED_KEYS)) {
            
            ps.setString(1, login.getFirstName());
            ps.setString(2, login.getLastName());
            ps.setString(3, login.getEmail());
            ps.setString(4, login.getPhoneNumber());
            ps.setInt(5, login.getAge());
            ps.setDate(6, (Date) login.getDob());
            ps.setString(7, login.getAddr1());
            ps.setString(8, login.getAddr2());
            ps.setString(9, login.getAddr3());
            ps.setString(10, login.getUserName());
            ps.setString(11, login.getPassword());
            
            ResultSet rs;
            
            if ((ps.executeUpdate() == 0) || !(rs = ps.getGeneratedKeys()).next()) {
                throw new LoginException(ExceptionCode.CREATION_FAILURE);
            } else {
                return rs.getLong(1);
            }
        } catch(Exception e) {
            e.printStackTrace();
            throw new LoginException(ExceptionCode.CREATION_FAILURE);
        }
    }
    
    public String read(String username) {
        Login l = new Login();
        try (PreparedStatement ps = ConnectionService.get().prepareStatement(Query.readPass)) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                l.setUserName(rs.getString("username"));
                l.setPassword(rs.getString("password"));
            }
        } catch(Exception e) {
            throw new LoginException(ExceptionCode.ENTER_DATA);
        }
        return l.getPassword();
    }
    
    public ArrayList<Login> readData() throws SQLException {
        ArrayList<Login> al = new ArrayList<Login>();
        try (PreparedStatement ps = ConnectionService.get().prepareStatement(Query.read)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Login l = new Login(rs.getString("first_name"), rs.getString("last_name"),
                        rs.getString("email"), rs.getString("phone_number"), rs.getInt("Age"), rs.getDate("dob"),
                        rs.getString("address1"), rs.getString("address2"), rs.getString("address3"), rs.getString("username"));
                al.add(l);
            }
        }
        return al;
    }
}
