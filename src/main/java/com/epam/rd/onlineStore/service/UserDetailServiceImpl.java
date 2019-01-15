package com.epam.rd.onlineStore.service;

import com.epam.rd.onlineStore.dto.UserDAO;
import com.epam.rd.onlineStore.model.MyUserPrincipal;
import com.epam.rd.onlineStore.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.findUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new MyUserPrincipal(user);

//        //User userObject = UserDAO.findUserByLogin(username);
//        User userObject = userService.findUserByLogin(username);
//
//        if (userObject != null) {
//            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//
//            return new User(
//                    //userObject.getUsername(),
//                    ((com.epam.rd.onlineStore.model.User) userObject).getLogin(),
//                    userObject.getPassword(),
//                    authorities
//            );
//        }
//
//        throw new UsernameNotFoundException(
//                "User '" + username + "' not found.");
    }

}
