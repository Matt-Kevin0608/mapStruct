package com.thoughtworks.mapstruct.performance;

import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.BeanUtils;

import java.time.Instant;
import java.util.Date;

public class CarDtoMapperTest {

    @Test
    public void performanceTest() {
        Car car = buildCar();
        System.out.println(modelMapperPerformanceResult(car));
        System.out.println(springBeanUtilsPerformanceResult(car));
        System.out.println(mapStructPerformanceResult(car));
        System.out.println(manualPerformance(car));

    }

    private Car buildCar() {
        Engine engine = Engine.builder().type("V6").build();
        return Car.builder().id(1).make("Hong Qi").numOfSeats(4).releaseDate(Date.from(Instant.now())).engine(engine).build();
    }

    private String modelMapperPerformanceResult(Car car) {
        ModelMapper modelMapper = new ModelMapper();
        TypeMap<Car, CarDto> typeMap = modelMapper.createTypeMap(Car.class, CarDto.class);
        typeMap.addMappings(mapper -> {
            mapper.map(Car::getEngine, CarDto::setEngineDto);
        });

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            CarDto carDto = modelMapper.map(car, CarDto.class);
        }
        long time2 = System.currentTimeMillis();
        return "ModelMapper Result: " + (time2 - time1) + "ms";
    }

    private String springBeanUtilsPerformanceResult(Car car) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            CarDto carDto = new CarDto();
            EngineDto engineDto = new EngineDto();
            BeanUtils.copyProperties(car.getEngine(), engineDto);
            BeanUtils.copyProperties(car, carDto);
            carDto.setEngineDto(engineDto);
        }
        long time2 = System.currentTimeMillis();
        return "Bean Utils Result: " + (time2 - time1) + "ms";
    }

    private String mapStructPerformanceResult(Car car) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            CarDto carDto = CarMapper.INSTANCE.toDto(car);
        }
        long time2 = System.currentTimeMillis();
        return "MapStruct Result: " + (time2 - time1) + "ms";

    }

    private String manualPerformance(Car car) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            EngineDto engineDto = new EngineDto();
            engineDto.setType(car.getEngine().getType());
            CarDto carDto = new CarDto();
            carDto.setId(car.getId());
            carDto.setMake(car.getMake());
            carDto.setNumOfSeats(car.getNumOfSeats());
            carDto.setReleaseDate(car.getReleaseDate());
            carDto.setEngineDto(engineDto);
        }
        long time2 = System.currentTimeMillis();
        return "Manual Result: " + (time2 - time1) + "ms";
    }
}
