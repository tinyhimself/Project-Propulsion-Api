package com.propulsion.app.propulsion.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "[user]")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String surname;

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public User() {
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
