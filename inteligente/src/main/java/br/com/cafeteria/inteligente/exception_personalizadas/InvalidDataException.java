package br.com.cafeteria.inteligente.exception_personalizadas;

public class InvalidDataException extends RuntimeException{
    public InvalidDataException(String message){
        super(message);
    }
}
