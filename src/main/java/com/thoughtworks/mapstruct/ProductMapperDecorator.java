package com.thoughtworks.mapstruct;

public class ProductMapperDecorator implements ProductMapper {
    private final ProductMapper delegate;

    public ProductMapperDecorator(ProductMapper delegate) {
        this.delegate = delegate;
    }

    @Override
    public Product toDomain(ProductDto productDto) {
        return delegate.toDomain(productDto);
    }
}
