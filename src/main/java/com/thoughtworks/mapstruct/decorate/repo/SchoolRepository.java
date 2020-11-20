package com.thoughtworks.mapstruct.decorate.repo;

import com.thoughtworks.mapstruct.decorate.School;
import com.thoughtworks.mapstruct.decorate.SchoolEntity;
import com.thoughtworks.mapstruct.decorate.SchoolMapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SchoolRepository {
    private static Map<Long, SchoolEntity> schoolEntityMap = new HashMap<>();

    static {
        schoolEntityMap.put(1L, SchoolEntity.builder().id(1L).address("address1").name("name1").build());
        schoolEntityMap.put(2L, SchoolEntity.builder().id(2L).address("address2").name("name2").build());
    }

    public School findById(Long id) {
        return SchoolMapper.INSTANCE.toDomain(schoolEntityMap.get(id));
    }
}
