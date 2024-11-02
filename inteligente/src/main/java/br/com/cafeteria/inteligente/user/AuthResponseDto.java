package br.com.cafeteria.inteligente.user;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String email;
    private String password;
    private String nome;
    private String sobreNome;
    private String cpf;
    private String tokenJwt;

    public AuthResponseDto(User u, String s){
        this.email = u.getEmail();
        this.password = u.getPassword();
        this.nome = u.getNome();
        this.sobreNome = u.getSobreNome();
        this.cpf = u.getCpf();
        this.tokenJwt = s;
    }
}
