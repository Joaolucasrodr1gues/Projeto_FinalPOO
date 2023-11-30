package org.example;

// class para exceptions/erros
public class InvalidPriceException extends Exception{
    public InvalidPriceException(String message){
        super(message);
    }
}
