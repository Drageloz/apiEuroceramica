package com.euroceramica.dashboard.persistence;

import com.euroceramica.dashboard.domain.Users;
import com.euroceramica.dashboard.domain.repository.UsersRepository;
import com.euroceramica.dashboard.persistence.crud.UsersCrudRepository;
import com.euroceramica.dashboard.persistence.entity.EntityUsers;
import com.euroceramica.dashboard.persistence.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EntityUsersRepository implements UsersRepository {

    @Autowired
    private UsersCrudRepository userCrudRepository;

    @Autowired
    private UsersMapper mapper;

    @Override
    public List<Users> getAll(){
        List<EntityUsers> Users = (List<EntityUsers>) userCrudRepository.findAll();
        return mapper.toUsers(Users);
    }
}
