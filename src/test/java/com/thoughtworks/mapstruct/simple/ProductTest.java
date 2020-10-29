package com.thoughtworks.mapstruct.simple;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

    @Test
    public void test() {
        ProductDto productDto = ProductDto.builder().name("高露洁").color("白色").company("高露洁balbala生产公司").count(1000).build();
        Product product = ProductMapper.INSTANCE.toDomain(productDto);
        Assert.assertEquals(productDto.getName(), product.getName());
        Assert.assertEquals(productDto.getColor(), product.getColor());
        Assert.assertEquals(productDto.getCompany(), product.getCompany());
        Assert.assertEquals(productDto.getCount(), product.getCount());
    }
}
