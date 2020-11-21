package com.company.Lesson7_20;

public class Author {

    private String name;
    private String surename;
    private String gender;

    public Author(String name, String surename, String gender) {
        this.name = name;
        this.surename = surename;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
