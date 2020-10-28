package com.thoughtworks.mapstruct;

import org.junit.*;

public class ProductTest {

    @Test
    public void test() {
        ProductDto productDto = ProductDto.builder().names("name").build();
        Product product = ProductMapper.INSTANCE.toDomain(productDto);
        Assert.assertEquals(productDto.getNames(), product.getName());
    }
}
