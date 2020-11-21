package com.company.Lesson7_19;

import java.util.Random;

public class Properties {

    private String name;
    private String password;
    private String role;

    public Properties(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
