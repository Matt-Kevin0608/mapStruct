package com.thoughtworks.mapstruct.car;

import org.junit.Assert;
import org.junit.Test;

public class CarMapperTest {

    @Test
    public void testCarMapper() {
        Car car = Car.builder().brand("劳斯莱斯").color("粉色").id("陕A88888").make("劳斯莱斯工厂").numberOfSeat(6).build();
        CarDto carDto = CarMapper.INSTANCE.toDto(car);
        Assert.assertEquals(car.getMake(), carDto.getManufacturer());
    }
}
