package com.epam.rd.onlineStore.model;

import java.io.Serializable;

public class User implements Serializable {

    private String userName;
    private String userSurname;
    private String login;
    private String password;
    private String email;

    public User(String userName, String userSurname, String login, String password, String email) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
