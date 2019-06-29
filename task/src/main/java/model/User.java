package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private int id;
    private String name;
    private String sureName;

    public User(ResultSet resultSet) {
        try {
            while (resultSet.next()){
                setId(resultSet.getInt("id"));
                setName(resultSet.getString("name"));
                setSureName(resultSet.getString("sureName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User() {
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

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                '}';
    }
}
