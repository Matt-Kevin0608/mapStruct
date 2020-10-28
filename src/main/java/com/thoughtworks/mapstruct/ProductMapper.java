package com.thoughtworks.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper( ProductMapper.class );

    @Mapping(target = "name", source = "names")
    Product toDomain(ProductDto productDto);
}
