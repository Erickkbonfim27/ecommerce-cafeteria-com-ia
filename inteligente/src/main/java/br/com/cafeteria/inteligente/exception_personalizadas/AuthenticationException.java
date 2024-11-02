package br.com.cafeteria.inteligente.exception_personalizadas;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message) {
        super(message);
    }
}

