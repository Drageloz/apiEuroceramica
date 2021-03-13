package com.euroceramica.dashboard.domain.repository;


import com.euroceramica.dashboard.domain.CounterExample;

import java.util.List;

public interface CountersExampleRepository {

    List<CounterExample> getAll();
}
