package com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Model;

public class User {
    private String username;
    private String password;
    private String FullName;
    private String Phone;
    private String Gmail;
    private String Address;

    public User(String username, String password, String fullName, String phone, String gmail, String address) {
        this.username = username;
        this.password = password;
        FullName = fullName;
        Phone = phone;
        Gmail = gmail;
        Address = address;
    }

    public User() {
        }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
