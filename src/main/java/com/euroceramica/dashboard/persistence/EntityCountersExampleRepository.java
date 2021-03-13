package com.euroceramica.dashboard.persistence;

import com.euroceramica.dashboard.domain.CounterExample;
import com.euroceramica.dashboard.domain.repository.CountersExampleRepository;
import com.euroceramica.dashboard.persistence.crud.CountersCrudExampleRepository;
import com.euroceramica.dashboard.persistence.entity.EntityCountersExample;
import com.euroceramica.dashboard.persistence.mapper.CountersExampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public CounterExample save(CounterExample counterExample) {
        EntityCountersExample entityCountersExample = countersCrudExampleRepository.save(mapper.toCounterExample(counterExample));
        return mapper.toCounterExample(entityCountersExample);
    }

    @Override
    public Optional<CounterExample> getCounterById(Integer counterId) {
         return countersCrudExampleRepository.findById(counterId).map(counter -> mapper.toCounterExample(counter));
    }


}
