package com.euroceramica.dashboard.persistence.mapper;

import com.euroceramica.dashboard.domain.Users;
import com.euroceramica.dashboard.persistence.entity.EntityUsers;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsersMapper{

    Users toUsers(EntityUsers entityUsers);

    List<Users> toUsers(List<EntityUsers> entityUsers);

}
