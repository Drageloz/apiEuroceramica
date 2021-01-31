package com.euroceramica.dashboard.persistence.crud;

import com.euroceramica.dashboard.persistence.entity.EntityCounters;
import org.springframework.data.repository.CrudRepository;

public interface CountersCrudRepository extends CrudRepository<EntityCounters, Integer>{
}
