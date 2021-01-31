package com.euroceramica.dashboard.persistence.mapper;

import com.euroceramica.dashboard.domain.Counters;
import com.euroceramica.dashboard.persistence.entity.EntityCounters;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountersMapper {

    Counters toCounters(EntityCounters entityCounters);

    List<Counters> toCounters(List<EntityCounters> entityCounters);

}
