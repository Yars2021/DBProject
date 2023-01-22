package ru.itmo.dbproject.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class InternalUser {
    @Id
    @Column(nullable = false, length = 32)
    private String login;
    @Column(nullable = false, length = 64)
    private String username;

    @Column(nullable = false, length = 256)
    private String password;

    @Column(nullable = true, length = 128)
    private String token;

    public InternalUser() {
    }

    public InternalUser(String login, String username, String password, String token) {
        this.login = login;
        this.username = username;
        this.password = password;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
