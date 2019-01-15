package com.epam.rd.onlineStore.service;

import com.epam.rd.onlineStore.dto.UserDAO;
import com.epam.rd.onlineStore.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserDAO userDAO = new UserDAO();

    public UserService() {}

    public List<User> findAll() {
        return userDAO.findAll();
    }

    public User findByLoginAndPassword(String login, String password) {
        return userDAO.findByUsernameAndPassword(login, password);
    }

    public User findUserByUsername(String username) {
        return userDAO.findUserByUsername(username);
    }


}
