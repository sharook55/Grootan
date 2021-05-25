package com.login.model;

import java.util.Date;

public class Login {
    
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String userName;
    private String password;
    private Date dob;
    private int age;
    private String addr1;
    private String addr2;
    private String addr3;
    
    public Login(String firstName, String lastName, String email, String phoneNumber, String userName, String password, Date date, int age, String a1,
            String a2, String a3) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email =email;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
        this.dob = date;
        this.age = age;
        this.addr1 = a1;
        this.addr2 = a2;
        this.addr3 = a3;
    }
    
    public Login() {
    }

    public Login(String firstName, String lastName, String email, String phoneNumber, int age, java.sql.Date date, String a1, String a2, String a3, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email =email;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }
    
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getAddr3() {
        return addr3;
    }

    public void setAddr3(String addr3) {
        this.addr3 = addr3;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Login [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
                + phoneNumber + ", userName=" + userName + ", password=" + password + ", dob=" + dob + ", age=" + age
                + ", addr1=" + addr1 + ", addr2=" + addr2 + ", addr3=" + addr3 + "]";
    }
    
    
}
