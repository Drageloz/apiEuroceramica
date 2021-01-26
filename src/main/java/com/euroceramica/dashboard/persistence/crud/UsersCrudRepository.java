package com.euroceramica.dashboard.persistence.crud;

import com.euroceramica.dashboard.domain.Users;
import com.euroceramica.dashboard.persistence.entity.EntityUsers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsersCrudRepository extends CrudRepository<EntityUsers, Integer> {

    Optional<EntityUsers> findByUsUser(String userName);
}
