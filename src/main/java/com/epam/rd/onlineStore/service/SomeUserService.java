package com.epam.rd.onlineStore.service;

import com.epam.rd.onlineStore.dto.UserDAO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class SomeUserService implements UserDetailsService {

//    private final UserDAO userDAO;
//
//    public SomeUserService(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }

    private final UserService userService;

    public SomeUserService(UserService userService) {
        //this.userDAO = userDAO;
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //User userObject = UserDAO.findUserByLogin(username);
        User userObject = userService.findUserByLogin(username);

        if (userObject != null) {
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

            return new User(
                    //userObject.getUsername(),
                    ((com.epam.rd.onlineStore.model.User) userObject).getLogin(),
                    userObject.getPassword(),
                    authorities
            );
        }

        throw new UsernameNotFoundException(
                "User '" + username + "' not found.");
    }



}
}
