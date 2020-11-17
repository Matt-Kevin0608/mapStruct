package com.thoughtworks.mapstruct.performance;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private long id;
    private String make;
    private int numOfSeats;
    private Date releaseDate;
    private Engine engine;
}
