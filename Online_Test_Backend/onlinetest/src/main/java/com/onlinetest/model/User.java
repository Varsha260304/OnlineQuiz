package com.onlinetest.model;

public class User {
    private int id;
    private String name;
    private String password;
    private String phone;
    private String mail;
    private String gender;

    // Constructors, getters, and setters

    public User() {
    }

    public User(int id, String name, String password, String phone, String mail, String gender) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.mail = mail;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return phone;
    }

    

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}