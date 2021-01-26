package com.euroceramica.dashboard.domain.service;

import com.euroceramica.dashboard.domain.Users;
import com.euroceramica.dashboard.domain.repository.UsersRepository;
import com.euroceramica.dashboard.persistence.crud.UsersCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAll(){
        return usersRepository.getAll();
    }

    public Optional<Users> getUser(int userId){ return usersRepository.getUser(userId); }

    public Optional<Users> getUserByUserName(String userName){ return usersRepository.getUserByUserName(userName); }

}
