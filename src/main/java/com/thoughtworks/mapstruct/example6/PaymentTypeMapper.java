package com.thoughtworks.mapstruct.example6;

import org.mapstruct.Mapper;
import org.mapstruct.ValueMapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentTypeMapper {

    PaymentTypeMapper INSTANCE = Mappers.getMapper(PaymentTypeMapper.class);

    @ValueMapping(source = "CARD_VISA", target = "CARD")
    @ValueMapping(source = "CARD_MASTER", target = "CARD")
    @ValueMapping(source = "CARD_CREDIT", target = "CARD")
    PaymentTypeView paymentTypeToPaymentTypeView(PaymentType paymentType);
}

