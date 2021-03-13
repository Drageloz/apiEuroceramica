package com.euroceramica.dashboard.persistence.mapper;

import com.euroceramica.dashboard.domain.CounterExample;
import com.euroceramica.dashboard.persistence.entity.EntityCountersExample;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountersExampleMapper {

    CounterExample toCounterExample(EntityCountersExample entityCountersExample);

    List<CounterExample> toCounterExample(List<EntityCountersExample> entityCountersExamples);

    EntityCountersExample toCounterExample(CounterExample counterExample);

}
