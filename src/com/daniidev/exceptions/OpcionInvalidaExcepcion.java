package com.daniidev.exceptions;

public class OpcionInvalidaExcepcion extends RuntimeException {
    private String message;

    public OpcionInvalidaExcepcion(){
        this.message = "Opción no valida por favor, vuelva a intentar";
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

