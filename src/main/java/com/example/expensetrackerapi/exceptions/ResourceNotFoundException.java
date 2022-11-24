package com.example.expensetrackerapi.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1l ;

    public ResourceNotFoundException(String message){
        super(message)  ;
    }
}
