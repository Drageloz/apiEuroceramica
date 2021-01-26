package com.euroceramica.dashboard.domain.repository;

import com.euroceramica.dashboard.domain.Users;

import java.util.List;
import java.util.Optional;

public interface UsersRepository {

    List<Users> getAll();
    Optional<Users> getUser(int UserId);
    Optional<Users> getUserByUserName(String userName);

}
