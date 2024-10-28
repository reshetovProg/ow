package com.example.owner.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DublicatePKException extends RuntimeException{
    public DublicatePKException(String message) {
        super(message);
    }
}
