package com.euroceramica.dashboard.domain.service;


import com.euroceramica.dashboard.domain.CounterExample;
import com.euroceramica.dashboard.domain.repository.CountersExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CounterExampleService {

    @Autowired
    private CountersExampleRepository countersExampleRepository;

    public List<CounterExample> getAll(){
        return countersExampleRepository.getAll();
    }

    public Optional<CounterExample> getCounterById(Integer counterId){ return countersExampleRepository.getCounterById(counterId);}

    public CounterExample save(CounterExample counterExample){ return countersExampleRepository.save(counterExample); }
}
