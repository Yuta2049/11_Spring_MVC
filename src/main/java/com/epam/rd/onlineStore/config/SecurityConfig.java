package com.epam.rd.onlineStore.config;

import com.epam.rd.onlineStore.service.SomeUserService;
import com.epam.rd.onlineStore.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {




    protected static class AuthentificationConfigurer extends GlobalAuthenticationConfigurerAdapter {

        UserService userService;

        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {
            //super.init(auth);
            auth
                    .userDetailsService(new SomeUserService(userService));

        }
    }


}
