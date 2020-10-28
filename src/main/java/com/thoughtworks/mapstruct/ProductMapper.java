package com.thoughtworks.mapstruct;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
@DecoratedWith(ProductMapperDecorator.class)
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper( ProductMapper.class );

    @Mapping(target = "name", source = "names")
    Product toDomain(ProductDto productDto);
}
