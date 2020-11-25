package com.thoughtworks.mapstruct.example8;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ValidationException extends RuntimeException{
    private String message;
}
