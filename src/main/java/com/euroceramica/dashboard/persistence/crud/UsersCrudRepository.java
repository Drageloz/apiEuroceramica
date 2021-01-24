package com.euroceramica.dashboard.persistence.crud;

import com.euroceramica.dashboard.persistence.entity.EntityUsers;
import org.springframework.data.repository.CrudRepository;

public interface UsersCrudRepository extends CrudRepository<EntityUsers, Integer> {

}
