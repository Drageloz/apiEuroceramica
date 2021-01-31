package com.euroceramica.dashboard.domain.repository;

import com.euroceramica.dashboard.domain.Counters;

import java.util.List;

public interface CountersRepository {
    List<Counters> getAll();

}
