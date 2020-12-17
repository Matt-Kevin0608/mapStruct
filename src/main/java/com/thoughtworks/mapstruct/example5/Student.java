package com.thoughtworks.mapstruct.example5;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Builder
public class Student {
    private List<String> hobbies;
    private Map<String, Date>  eventToDateMap;
    private Set<String> favoriteColors;
}
