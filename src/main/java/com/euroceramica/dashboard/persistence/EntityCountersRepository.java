package com.euroceramica.dashboard.persistence;

import com.euroceramica.dashboard.domain.Counters;
import com.euroceramica.dashboard.domain.repository.CountersRepository;
import com.euroceramica.dashboard.persistence.crud.CountersCrudRepository;
import com.euroceramica.dashboard.persistence.entity.EntityCounters;
import com.euroceramica.dashboard.persistence.mapper.CountersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EntityCountersRepository implements CountersRepository {

    @Autowired
    private CountersCrudRepository countersCrudRepository;

    @Autowired
    private CountersMapper mapper;

    @Override
    public List<Counters> getAll(){
        List<EntityCounters> counters = (List<EntityCounters>) countersCrudRepository.findAll();
        return mapper.toCounters(counters);
    }

}
