package com.euroceramica.dashboard.domain.repository;


import com.euroceramica.dashboard.domain.CounterExample;

import java.util.List;
import java.util.Optional;

public interface CountersExampleRepository {

    List<CounterExample> getAll();

    CounterExample save(CounterExample counterExample);

    Optional<CounterExample> getCounterById(Integer counterId);
}
