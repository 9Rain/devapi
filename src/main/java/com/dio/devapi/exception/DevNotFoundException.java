package com.dio.devapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DevNotFoundException extends Exception {

    public DevNotFoundException(Long id) {
        super(String.format("Dev with ID %s not found", id));
    }
}