package com.example.moean_p.Model;

public class User {
    private String Fname, Lastname, role,Email,Password,uid;

    public User(){

    }
    public User(String Fname, String Lastname, String role, String Email, String Password, String uid) {
        this.Fname = Fname;
        this.Lastname = Lastname;
        this.role = role;
        this.Email=Email;
        this.Password=Password;
        this.uid=uid;
    }

    public String getRole() {
        return role;
    }
    public String getuid() {
        return uid;
    }



    public String getFname() {
        return Fname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }






}

