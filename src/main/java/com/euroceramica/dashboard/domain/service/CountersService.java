package com.euroceramica.dashboard.domain.service;

import com.euroceramica.dashboard.domain.Counters;
import com.euroceramica.dashboard.domain.repository.CountersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountersService {

    @Autowired
    private CountersRepository countersRepository;

    public List<Counters> getAll(){
        return countersRepository.getAll();
    }
}
