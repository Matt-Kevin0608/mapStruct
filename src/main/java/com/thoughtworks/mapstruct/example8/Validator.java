package com.thoughtworks.mapstruct.example8;

public class Validator {
    public int validateId(int id) throws ValidationException {
        if (id == -1) {
            throw new ValidationException("Invalid value in ID");
        }
        return id;
    }
}
