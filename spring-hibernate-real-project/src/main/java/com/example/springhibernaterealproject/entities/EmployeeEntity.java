package com.example.springhibernaterealproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {
    @Id
    int id;
    String name;
    String position;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
