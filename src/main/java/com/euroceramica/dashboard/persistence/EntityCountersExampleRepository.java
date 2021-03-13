package com.euroceramica.dashboard.persistence;

import com.euroceramica.dashboard.domain.CounterExample;
import com.euroceramica.dashboard.domain.repository.CountersExampleRepository;
import com.euroceramica.dashboard.persistence.crud.CountersCrudExampleRepository;
import com.euroceramica.dashboard.persistence.entity.EntityCountersExample;
import com.euroceramica.dashboard.persistence.mapper.CountersExampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EntityCountersExampleRepository implements CountersExampleRepository {

    @Autowired
    private CountersCrudExampleRepository countersCrudExampleRepository;

    @Autowired
    private CountersExampleMapper mapper;

    @Override
    public List<CounterExample> getAll() {
        List<EntityCountersExample> counterExample = (List<EntityCountersExample>) countersCrudExampleRepository.findAll();
        return mapper.toCounterExample(counterExample);
    }
}
