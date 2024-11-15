package com.api.apiusers.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_user", unique = true, nullable = false)
    private String idUser;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    public User() {
    }

    public User(String idUser, String email, String name) {
        this.idUser = idUser;
        this.email = email;
        this.name = name;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
