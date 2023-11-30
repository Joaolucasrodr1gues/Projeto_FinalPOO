package org.example;
// class para exceptions/erros
public class ProductDoesNotExistException extends Exception{
    public ProductDoesNotExistException(String message){
        super(message);
    }
}
