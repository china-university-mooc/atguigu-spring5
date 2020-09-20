package com.itutry.spring5.entity;

public class User {

    private Integer id;
    private String name;
    private String status;

    public User() {
    }

    public User(Integer id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public User(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
