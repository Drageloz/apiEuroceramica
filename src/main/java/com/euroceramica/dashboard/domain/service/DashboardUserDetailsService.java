package com.euroceramica.dashboard.domain.service;

import com.euroceramica.dashboard.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DashboardUserDetailsService implements UserDetailsService {


    @Autowired
    UsersService usersService;

    @Override
    public UserDetails loadUserByUsername(String lastname) throws UsernameNotFoundException {
        Users user = usersService.getUserByUserName(lastname)
                .map(userData -> userData)
                .orElse(null);
        return new User(user.getUsUser(), "{noop}" + user.getUsPass(), new ArrayList<>());
    }
}
