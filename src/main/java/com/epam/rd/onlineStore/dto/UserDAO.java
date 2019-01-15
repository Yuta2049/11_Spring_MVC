package com.epam.rd.onlineStore.dto;

import com.epam.rd.onlineStore.model.Privilege;
import com.epam.rd.onlineStore.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDAO {

    public List<User> findAll() {

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();


        Set<Privilege> privilegesUser = new HashSet<>();
        privilegesUser.add(new Privilege(1, "User"));

        Set<Privilege> privilegesAdmin = new HashSet<>();
        privilegesAdmin.add(new Privilege(1, "Admin"));

        List<User> users = new ArrayList<>();

        users.add(new User(1, "admin", bCryptPasswordEncoder.encode("123"), privilegesAdmin));
        users.add(new User(2, "ivan", bCryptPasswordEncoder.encode("123"), privilegesUser));
        users.add(new User(3, "agafia", bCryptPasswordEncoder.encode("123"), privilegesUser));

        return users;
    }

    public User findByUsernameAndPassword(String username, String password) {
        List<User> users = findAll();
        return users.stream().filter(o -> o.getUsername().equals(username) && o.getPassword().equals(password)).findFirst().orElse(null);
    }


    public User findUserByUsername(String username) {
        List<User> users = findAll();
        return users.stream().filter(o -> o.getUsername().equals(username)).findFirst().orElse(null);
    }

}
