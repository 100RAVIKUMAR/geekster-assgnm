package com.Geekster.UserManagementSystem.Model;

public class User {
    private String user_id;
    private String name;
    private String username;
    private String Adress;
    private String ph_no;

    public User(String user_id, String name, String username, String adress, String ph_no) {
        this.user_id = user_id;
        this.name = name;
        this.username = username;
        Adress = adress;
        this.ph_no = ph_no;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getAdress() {
        return Adress;
    }

    public String getPh_no() {
        return ph_no;
    }
}
