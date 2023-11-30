package org.example;

// class para exceptions/erros
public class ProductAlreadyExists extends Exception{
    public ProductAlreadyExists(String message){
        super(message);
    }
}