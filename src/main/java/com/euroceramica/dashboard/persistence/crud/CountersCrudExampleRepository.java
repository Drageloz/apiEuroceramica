package com.euroceramica.dashboard.persistence.crud;

import com.euroceramica.dashboard.persistence.entity.EntityCountersExample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CountersCrudExampleRepository extends CrudRepository<EntityCountersExample, Integer> {

}
