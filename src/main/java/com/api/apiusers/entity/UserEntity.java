package com.api.apiusers.entity;

import jakarta.persistence.*;

import java.util.HashSet;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_user", unique = true, nullable = false)
    private String idUser;

    private String username;

    private String email;

    public UserEntity() {
    }

    public UserEntity(String idUser, String username, String email) {
        this.idUser = idUser;
        this.username = username;
        this.email = email;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
