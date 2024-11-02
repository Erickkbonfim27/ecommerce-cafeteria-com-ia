package br.com.cafeteria.inteligente.user;

import lombok.Data;

@Data
public class CreateUserDto {
    private String email;
    private String password;
    private String nome;
    private String sobreNome;
    private String cpf;
}
