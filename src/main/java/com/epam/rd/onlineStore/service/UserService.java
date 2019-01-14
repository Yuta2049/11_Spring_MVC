package com.epam.rd.onlineStore.service;

import com.epam.rd.onlineStore.dto.UserDAO;
import com.epam.rd.onlineStore.model.User;

import java.util.List;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public UserService() {}

    public List<User> findAll() {
        return userDAO.findAll();
    }

    public User findByLoginAndPassword(String login, String password) {
        return userDAO.findByLoginAndPassword(login, password);
    }

    public User findUserByLogin(String login) {
        return userDAO.findUserByLogin(login);
    }


}
